/*
 * pcap-septel.c: Packet capture interface for Intel Septel card
 *
 * The functionality of this code attempts to mimic that of pcap-linux as much
 * as possible.  This code is only needed when compiling in the Intel/Septel
 * card code at the same time as another type of device.
 *
 * Authors: Gilbert HOYEK (gil_hoyek@hotmail.com), Elias M. KHOURY
 * (+961 3 485343);
 *
 * @(#) $Header: //DTV/MP_BR/DTV_X_IDTV0801_002158_10_001_158_001/android/ics-4.x/external/libpcap/pcap-septel.h#1 $
 */

pcap_t *septel_open_live(const char *device, int snaplen, int promisc, int to_ms, char *ebuf);
