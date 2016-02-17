/* Copyright (C) 2003 Vladimir Roubtsov. All rights reserved.
 * 
 * This program and the accompanying materials are made available under
 * the terms of the Common Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/cpl-v10.html
 * 
 * $Id: //DTV/MP_BR/DTV_X_IDTV0801_002158_10_001_158_001/android/ics-4.x/external/emma/core/java12/com/vladium/jcd/cls/constant/ICONSTANTVisitor.java#1 $
 */
package com.vladium.jcd.cls.constant;

// ----------------------------------------------------------------------------
/**
 * @author (C) 2001, Vlad Roubtsov
 */
public
interface ICONSTANTVisitor
{
    // public: ................................................................
    
    //Object visit (CONSTANT_info constant, Object ctx);
    
    Object visit (CONSTANT_Class_info constant, Object ctx);
    
    Object visit (CONSTANT_InterfaceMethodref_info constant, Object ctx);
    Object visit (CONSTANT_Methodref_info constant, Object ctx);
    Object visit (CONSTANT_Fieldref_info constant, Object ctx);

    Object visit (CONSTANT_Double_info constant, Object ctx);
    Object visit (CONSTANT_Float_info constant, Object ctx);
    Object visit (CONSTANT_Integer_info constant, Object ctx);
    Object visit (CONSTANT_Long_info constant, Object ctx);
    Object visit (CONSTANT_String_info constant, Object ctx);

    Object visit (CONSTANT_Utf8_info constant, Object ctx);
    Object visit (CONSTANT_NameAndType_info constant, Object ctx);

} // end of interface
// ----------------------------------------------------------------------------