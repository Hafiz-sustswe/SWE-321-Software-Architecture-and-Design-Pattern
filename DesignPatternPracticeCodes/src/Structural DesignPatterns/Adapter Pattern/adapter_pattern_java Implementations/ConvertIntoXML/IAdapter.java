package structural_design_patterns.adapter;

public interface IAdapter {
    /**
     * @param <T>
     * @return
     */
    public <T> XML convert(T type);
    
}
