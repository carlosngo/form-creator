/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Core;

import java.util.List;

/**
 *
 * @author user
 */
public class Field {

    private String label;
    private List<String> multiOption;
    private String answer;

    public Field(String label, List<String> multiOption) {
        this.label = label;
        this.multiOption = multiOption;
        this.answer = "";
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the multiOption
     */
    public List<String> getMultiOption() {
        return multiOption;
    }

    /**
     * @param multiOption the multiOption to set
     */
    public void setMultiOption(List<String> multiOption) {
        this.multiOption = multiOption;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
