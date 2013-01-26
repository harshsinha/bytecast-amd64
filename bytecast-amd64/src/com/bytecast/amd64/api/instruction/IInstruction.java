/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytecast.amd64.api.instruction;


import com.bytecast.amd64.api.constants.InstructionType;
import java.util.List;

/**
 *
 * @author harsh
 */
public interface IInstruction {
    
    
    public List<IOperand> getOperands();
    
    public String getOpCode();
    
    public void addOperand(IOperand op);
    
    public void setOpCode(String opcode);
    
    public InstructionType getInstructiontype();
    
    public void setInstructionType(InstructionType instructionType);
    
}

