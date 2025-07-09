package creational.prototype;


class Experience implements Cloneable {
    private String company;
    private int years;

    public Experience(String company, int years) {
        setCompany(company);
        setYears(years);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.trim().isEmpty()) {
            throw new IllegalArgumentException("Company name cannot be null or empty");
        }
        this.company = company.trim();
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        this.years = years;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return company + " (" + years + " yrs)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Experience that = (Experience) obj;
        return years == that.years && company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(company, years);
    }
}
