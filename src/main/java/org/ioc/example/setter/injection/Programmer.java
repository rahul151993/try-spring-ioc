package org.ioc.example.setter.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Programmer {

    private String pName;
    private String primaryLanguage;
    private List<String> listOfLanguageKnown;
    private Set<String> tools;
    private Map<Integer, String> projectAssigned;
    private Properties languageWiseFramework;

    private Machine machine;

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public List<String> getListOfLanguageKnown() {
        return listOfLanguageKnown;
    }

    public void setListOfLanguageKnown(List<String> listOfLanguageKnown) {
        this.listOfLanguageKnown = listOfLanguageKnown;
    }

    public Set<String> getTools() {
        return tools;
    }

    public void setTools(Set<String> tools) {
        this.tools = tools;
    }

    public Map<Integer, String> getProjectAssigned() {
        return projectAssigned;
    }

    public void setProjectAssigned(Map<Integer, String> projectAssigned) {
        this.projectAssigned = projectAssigned;
    }

    public Properties getLanguageWiseFramework() {
        return languageWiseFramework;
    }

    public void setLanguageWiseFramework(Properties languageWiseFramework) {
        this.languageWiseFramework = languageWiseFramework;
    }

    public void writeSoftware(){
        this.machine.executeCode();
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "pName='" + pName + '\'' +
                ", primaryLanguage='" + primaryLanguage + '\'' +
                '}';
    }
}
