/*
 * prompt.c: Routines for retrieving and setting a prompt.
 *
 * $Header: //DTV/MP_BR/DTV_X_IDTV0801_002158_10_001_158_001/android/ics-4.x/external/e2fsprogs/lib/ss/prompt.c#1 $
 * $Locker$
 *
 * Copyright 1987, 1988 by MIT Student Information Processing Board
 *
 * Permission to use, copy, modify, and distribute this software and
 * its documentation for any purpose is hereby granted, provided that
 * the names of M.I.T. and the M.I.T. S.I.P.B. not be used in
 * advertising or publicity pertaining to distribution of the software
 * without specific, written prior permission.  M.I.T. and the
 * M.I.T. S.I.P.B. make no representations about the suitability of
 * this software for any purpose.  It is provided "as is" without
 * express or implied warranty.
 */

#include <stdio.h>
#include "ss_internal.h"

void ss_set_prompt(int sci_idx, char *new_prompt)
{
     ss_info(sci_idx)->prompt = new_prompt;
}

char *ss_get_prompt(int sci_idx)
{
     return(ss_info(sci_idx)->prompt);
}