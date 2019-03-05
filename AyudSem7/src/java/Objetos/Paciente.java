
package Objetos;

//@author gerardotobar
public class Paciente 
{
    
    private String m_strName;
    private String m_strLastName;
    private String m_strGender;
    private int m_intBirthYear;
    private int m_intBirthMonth;
    private int m_intBirthDay;
    private String m_strSymptoms;

    public Paciente(String m_strName, String m_strLastName, String m_strGender, int m_intBirthYear, int m_intBirthMonth, int m_intBirthDay, String m_strSymptoms) {
        this.m_strName = m_strName;
        this.m_strLastName = m_strLastName;
        this.m_strGender = m_strGender;
        this.m_intBirthYear = m_intBirthYear;
        this.m_intBirthMonth = m_intBirthMonth;
        this.m_intBirthDay = m_intBirthDay;
        this.m_strSymptoms = m_strSymptoms;
    }

    public String getM_strName() {
        return m_strName;
    }

    public void setM_strName(String m_strName) {
        this.m_strName = m_strName;
    }

    public String getM_strLastName() {
        return m_strLastName;
    }

    public void setM_strLastName(String m_strLastName) {
        this.m_strLastName = m_strLastName;
    }

    public String getM_strGender() {
        return m_strGender;
    }

    public void setM_strGender(String m_strGender) {
        this.m_strGender = m_strGender;
    }

    public int getM_intBirthYear() {
        return m_intBirthYear;
    }

    public void setM_intBirthYear(int m_intBirthYear) {
        this.m_intBirthYear = m_intBirthYear;
    }

    public int getM_intBirthMonth() {
        return m_intBirthMonth;
    }

    public void setM_intBirthMonth(int m_intBirthMonth) {
        this.m_intBirthMonth = m_intBirthMonth;
    }

    public int getM_intBirthDay() {
        return m_intBirthDay;
    }

    public void setM_intBirthDay(int m_intBirthDay) {
        this.m_intBirthDay = m_intBirthDay;
    }

    public String getM_strSymptoms() {
        return m_strSymptoms;
    }

    public void setM_strSymptoms(String m_strSymptoms) {
        this.m_strSymptoms = m_strSymptoms;
    }
    
    
    
    
    
}
