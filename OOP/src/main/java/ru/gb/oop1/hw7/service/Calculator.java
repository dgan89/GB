package ru.gb.oop1.hw7.service;

import ru.gb.oop1.hw7.model.*;

import java.util.List;

public class Calculator implements CalculatorInterface {
    private final LoggerInterface logger;

    public Calculator(LoggerInterface logger) {
        super();
        this.logger = logger;
    }

    @Override
    public double sum(List<? extends Number> numbers) {
        return this.executeWithLog(new SumOperation(), numbers);
    }

    @Override
    public double multiply(List<? extends Number> numbers) {
        return this.executeWithLog(new MultiplyOperation(), numbers);
    }

    @Override
    public double diff(List<? extends Number> numbers) {
        return this.executeWithLog(new DiffOperation(), numbers);
    }

    /**
     * Выпорлнение операции с логирпованием
     *
     * @param operation
     * @param numbers
     * @return
     */
    public double executeWithLog(OperationInterface operation, List<? extends Number> numbers) {
        double result = operation.execute(numbers);
        this.logger.addLog(operation.actionName() + ": " + numbers + " = " + result);

        return result;
    }
}
