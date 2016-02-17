/*
 ** Copyright (c) 2013 TCL Corp.
 ** All rights reserved.
 */

package com.tcl.net.samba;

public interface OnRecvMsg {
    public static final int NT_STATUS_OK = 0x00000000;
    public static final int NT_STATUS_MOUNT_SUCCESSFUL = 0x00000010;
    public static final int NT_STATUS_MOUNT_FAILURE = 0x00000011;
    public static final int NT_STATUS_UMOUNT_SUCCESSFUL = 0x00000012;
    public static final int NT_STATUS_UMOUNT_FAILURE = 0x00000013;
    public static final int NT_STATUS_UNSUCCESSFUL = 0xC0000001;
    public static final int NT_STATUS_NOT_IMPLEMENTED = 0xC0000002;
    public static final int NT_STATUS_INVALID_INFO_CLASS = 0xC0000003;
    public static final int NT_STATUS_ACCESS_VIOLATION = 0xC0000005;
    public static final int NT_STATUS_INVALID_HANDLE = 0xC0000008;
    public static final int NT_STATUS_INVALID_PARAMETER = 0xC000000d;
    public static final int NT_STATUS_NO_SUCH_DEVICE = 0xC000000e;
    public static final int NT_STATUS_NO_SUCH_FILE = 0xC000000f;
    public static final int NT_STATUS_MORE_PROCESSING_REQUIRED = 0xC0000016;
    public static final int NT_STATUS_ACCESS_DENIED = 0xC0000022;
    public static final int NT_STATUS_BUFFER_TOO_SMALL = 0xC0000023;
    public static final int NT_STATUS_OBJECT_NAME_INVALID = 0xC0000033;
    public static final int NT_STATUS_OBJECT_NAME_NOT_FOUND = 0xC0000034;
    public static final int NT_STATUS_OBJECT_NAME_COLLISION = 0xC0000035;
    public static final int NT_STATUS_PORT_DISCONNECTED = 0xC0000037;
    public static final int NT_STATUS_OBJECT_PATH_INVALID = 0xC0000039;
    public static final int NT_STATUS_OBJECT_PATH_NOT_FOUND = 0xC000003a;
    public static final int NT_STATUS_OBJECT_PATH_SYNTAX_BAD = 0xC000003b;
    public static final int NT_STATUS_SHARING_VIOLATION = 0xC0000043;
    public static final int NT_STATUS_DELETE_PENDING = 0xC0000056;
    public static final int NT_STATUS_NO_LOGON_SERVERS = 0xC000005e;
    public static final int NT_STATUS_USER_EXISTS = 0xC0000063;
    public static final int NT_STATUS_NO_SUCH_USER = 0xC0000064;
    public static final int NT_STATUS_WRONG_PASSWORD = 0xC000006a;
    public static final int NT_STATUS_LOGON_FAILURE = 0xC000006d;
    public static final int NT_STATUS_ACCOUNT_RESTRICTION = 0xC000006e;
    public static final int NT_STATUS_INVALID_LOGON_HOURS = 0xC000006f;
    public static final int NT_STATUS_INVALID_WORKSTATION = 0xC0000070;
    public static final int NT_STATUS_PASSWORD_EXPIRED = 0xC0000071;
    public static final int NT_STATUS_ACCOUNT_DISABLED = 0xC0000072;
    public static final int NT_STATUS_NONE_MAPPED = 0xC0000073;
    public static final int NT_STATUS_INVALID_SID = 0xC0000078;
    public static final int NT_STATUS_INSTANCE_NOT_AVAILABLE = 0xC00000ab;
    public static final int NT_STATUS_PIPE_NOT_AVAILABLE = 0xC00000ac;
    public static final int NT_STATUS_INVALID_PIPE_STATE = 0xC00000ad;
    public static final int NT_STATUS_PIPE_BUSY = 0xC00000ae;
    public static final int NT_STATUS_PIPE_DISCONNECTED = 0xC00000b0;
    public static final int NT_STATUS_PIPE_CLOSING = 0xC00000b1;
    public static final int NT_STATUS_PIPE_LISTENING = 0xC00000b3;
    public static final int NT_STATUS_FILE_IS_A_DIRECTORY = 0xC00000ba;
    public static final int NT_STATUS_NOT_SUPPORT = 0xC00000bb;
    public static final int NT_STATUS_DUPLICATE_NAME = 0xC00000bd;
    public static final int NT_STATUS_NETWORK_NAME_DELETED = 0xC00000c9;
    public static final int NT_STATUS_NETWORK_ACCESS_DENIED = 0xC00000ca;
    public static final int NT_STATUS_BAD_NETWORK_NAME = 0xC00000cc;
    public static final int NT_STATUS_REQUEST_NOT_ACCEPTED = 0xC00000d0;
    public static final int NT_STATUS_CANT_ACCESS_DOMAIN_INFO = 0xC00000da;
    public static final int NT_STATUS_NO_SUCH_DOMAIN = 0xC00000df;
    public static final int NT_STATUS_NOT_A_DIRECTORY = 0xC0000103;
    public static final int NT_STATUS_CANNOT_DELETE = 0xC0000121;
    public static final int NT_STATUS_INVALID_COMPUTER_NAME = 0xC0000122;
    public static final int NT_STATUS_PIPE_BROKEN = 0xC000014b;
    public static final int NT_STATUS_NO_SUCH_ALIAS = 0xC0000151;
    public static final int NT_STATUS_LOGON_TYPE_NOT_GRANTED = 0xC000015b;
    public static final int NT_STATUS_NO_TRUST_SAM_ACCOUNT = 0xC000018b;
    public static final int NT_STATUS_TRUSTED_DOMAIN_FAILURE = 0xC000018c;
    public static final int NT_STATUS_NOLOGON_WORKSTATION_TRUST_ACCOUNT = 0xC0000199;
    public static final int NT_STATUS_PASSWORD_MUST_CHANGE = 0xC0000224;
    public static final int NT_STATUS_NOT_FOUND = 0xC0000225;
    public static final int NT_STATUS_ACCOUNT_LOCKED_OUT = 0xC0000234;
    public static final int NT_STATUS_PATH_NOT_COVERED = 0xC0000257;
    public static final int NT_STATUS_IO_REPARSE_TAG_NOT_HANDLED = 0xC0000279;

    public void onRecvMsg(int msg);
}