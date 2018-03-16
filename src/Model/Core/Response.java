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
public class Response {

    private final List<Field> fields;

    public Response(List<Field> fields) {
        this.fields = fields;
    }

    /**
     * @return the fields
     */
    public List<Field> getFields() {
        return fields;
    }

}
