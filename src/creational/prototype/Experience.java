package creational.prototype;

import java.util.Objects;

class Experience implements Cloneable {
    private final String company;
    private final int years;

    public Experience(String company, int years) {
        if (company == null || company.trim().isEmpty()) {
            throw new IllegalArgumentException("Company name cannot be null or empty");
        }
        if (years < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        this.company = company.trim();
        this.years = years;
    }

    public String getCompany() {
        return company;
    }

    public int getYears() {
        return years;
    }

    @Override
    public Experience clone() {
        try {
            return (Experience) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning Experience failed: " + e.getMessage(), e);
        }
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
        return Objects.hash(company, years);
    }
}
