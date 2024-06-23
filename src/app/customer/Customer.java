package app.customer;

public class Customer {
    private String name;
    private Long years;

    public Customer(String name, Long years) {
        this.name = name;
        this.years = validateYears(years);
    }

    private Long validateYears(Long years) throws RuntimeException {
        if (years < 18) {
            throw new RuntimeException("Precisa ter idade maior que 18 anos");
        }
        return years;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getYears() {
        return years;
    }
    public void setYears(Long years) {
        this.years = years;
    }
}
