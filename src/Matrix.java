import java.util.ArrayList;
import java.util.stream.IntStream;

public class Matrix {
    /**
     * Размер блока
     */
    private static final int BLOCK_SIZE = 3;

    /**
     * Количесво блоков
     */
    private static final int BLOCK_COUNT = 3;

    /**
     * Значения
     */
    private final char[][] matrix;

    /**
     * Блоки
     */
    private final ArrayList<Matrix> blocks = new ArrayList<>();

    /**
     * @param chars Значения
     */
    public Matrix(char[][] chars) {
        super();
        this.matrix = chars;
    }

    /**
     * Колонка по индексу
     *
     * @param index
     * @return
     */
    public char[] getColumn(int index) {
        char[] column = new char[this.getLength()];

        for (int i = 0; i < this.getLength(); i++) {
            column[i] = matrix[i][index];
        }

        return column;
    }

    /**
     * Строка по индексу
     *
     * @param index
     * @return
     */
    public char[] getRow(int index) {
        char[] row = new char[this.getLength()];
        System.arraycopy(matrix[index], 0, row, 0, matrix[index].length);

        return row;
    }

    /**
     * Все значения матрицы
     *
     * @return
     */
    public char[] getChars() {
        char[] chars = new char[9];

        IntStream.rangeClosed(0, this.getLength() - 1).forEachOrdered(n -> {
            System.arraycopy(matrix[n], 0, chars, n * 3, matrix[n].length);
        });

        return chars;
    }

    /**
     * Размер матрицы
     *
     * @return
     */
    public int getLength() {
        return this.matrix[0].length;
    }

    /**
     * Список блоков
     *
     * @return Возврат блоков
     */
    public Matrix[] getBlocks() {
        if (this.blocks.isEmpty()) {
            this.initBlocks();
        }

        return this.blocks.toArray(new Matrix[0]);
    }

    /**
     * Подготовка блоков
     */
    private void initBlocks() {
        IntStream.rangeClosed(0, BLOCK_COUNT - 1).forEachOrdered(rowNum -> {
            int rowPos = rowNum * BLOCK_SIZE;
            char[][] block = new char[BLOCK_SIZE][BLOCK_SIZE];

            IntStream.rangeClosed(0, BLOCK_COUNT - 1).forEachOrdered(colNum -> {
                int colPos = colNum * BLOCK_SIZE;

                System.arraycopy(matrix[rowPos], colPos, block[0], 0, BLOCK_SIZE);
                System.arraycopy(matrix[rowPos + 1], colPos, block[1], 0, BLOCK_SIZE);
                System.arraycopy(matrix[rowPos + 2], colPos, block[2], 0, BLOCK_SIZE);

                this.blocks.add(new Matrix(block));
            });
        });
    }
}
