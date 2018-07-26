/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capgemini;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ediaz
 */
public class Row {
    
    private List<Section> sections = new ArrayList<>();

    /**
     * @return the sections
     */
    public List<Section> getSections() {
        return sections;
    }

    /**
     * @param sections the sections to set
     */
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

   
    
}
