/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j10_objectConversion;

/**
 *
 * @author bilsis
 */
public class CopyWriter extends Employee {

    final WritingType writingType;

    public CopyWriter(String name, double salary, WritingType writingType) {
        super(name, salary);
        this.writingType = writingType;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", wringType:" + writingType.getDescription();
    }

    public WritingType getWritingType() {
        return writingType;
    }
    
    public String getWritingTypeInText(){
        return writingType.getDescription();
    }
}
