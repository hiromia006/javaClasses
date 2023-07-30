package generic.generic;

public class DataType<T> {
    private T dataType;

    public DataType(T dataType) {
        this.dataType = dataType;
    }

    public T getDataType() {
        return dataType;
    }
}
