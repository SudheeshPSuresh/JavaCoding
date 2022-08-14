package company;

public class Students {
    private Integer studentId;
    private String studentName;
    private Gender gender;
    private String email;
    private Double mark;
    private Double englsh;
    private Double maths;

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", mark=" + mark +
                ", englsh=" + englsh +
                ", maths=" + maths +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Double getEnglsh() {
        return englsh;
    }

    public void setEnglsh(Double englsh) {
        this.englsh = englsh;
    }

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public Students(Integer studentId, String studentName, Gender gender, String email, Double mark, Double englsh, Double maths) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.email = email;
        this.mark = mark;
        this.englsh = englsh;
        this.maths = maths;
    }
}
