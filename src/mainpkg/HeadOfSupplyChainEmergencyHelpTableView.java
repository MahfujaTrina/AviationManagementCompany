package mainpkg;

/**
 *
 * @author rttit
 */
public class HeadOfSupplyChainEmergencyHelpTableView {
    private String name;
    private int age;
    private String gender;
    private String emergencyHelp;

    public HeadOfSupplyChainEmergencyHelpTableView(String name, int age, String gender, String emergencyHelp) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emergencyHelp = emergencyHelp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmergencyHelp() {
        return emergencyHelp;
    }

    public void setEmergencyHelp(String emergencyHelp) {
        this.emergencyHelp = emergencyHelp;
    }

    @Override
    public String toString() {
        return "HeadOfSupplyChainEmergencyHelpTableView{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", emergencyHelp=" + emergencyHelp + '}';
    }
    
    
}
