package rosinnii.code;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private static int employeeNum = 0;
    private int id;
    private String name;
    private LocalDate birthday;
    private boolean gender;
    private double salary;
    private ProgramLanguages programLanguage;

    public Employee() {
    }

    public Employee(String name, String birthday, String gender, double salary, String programLanguageName) {
        employeeNum++;
        id = employeeNum;
        this.name = name;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.gender = "male".equals(gender);
        this.salary = salary;
        this.programLanguage = ProgramLanguages.getProgramLanguagesByName(programLanguageName);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public ProgramLanguages getProgramLanguage() {
        return programLanguage;
    }

    //For displaying
    public String getBirthdayAsString() {
        return birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public String getGenderAsString() {
        return gender ? "male" : "female";
    }

    public String getSalaryCurrencyAsString() {
        return String.format("%.2f UAH", salary);
    }

    public String getProgramLanguageAsString() {
        return programLanguage.getDisplayName();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(""+id+": ");
        sb.append(name).append(" - ");
        sb.append(getBirthdayAsString()).append(", ");
        sb.append(getGenderAsString()).append(", ");
        sb.append(getSalaryCurrencyAsString()).append(", ");
        sb.append(getProgramLanguageAsString());
        return sb.toString();
    }

    public String toStringForHTMLtable() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("<tr>");
        sb.append("<td>").append(name).append("</td>");
        sb.append("<td>").append(getBirthday()).append("</td>");
        sb.append("<td>").append(getGenderAsString()).append("</td>");
        sb.append("<td>").append(getSalaryCurrencyAsString()).append("</td>");
        sb.append("<td>").append(getProgramLanguageAsString()).append("</td>");
        sb.append("</tr>");
        return sb.toString();
    }


}
