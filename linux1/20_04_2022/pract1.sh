#!/bin/bash

file=/etc/passwd


while read -r line; do
	echo $line
done < "$file"

<<notes	
he IP Storage services module (IPS module) and the MPS-14/2 module allow you to use FCIP and
iSCSI features. Both modules integrate seamlessly into the Cisco MDS 9000 Family, and support the full
range of features available on other switching modules, including VSANs, security, and traffic
management. The following types storage services modules are currently available for use in any switch
in the Cisco MDS 9200 Series or in the Cisco MDS 9500 Series:
notes


<<notes2
iSCSI—The IPS module provides IP hosts access to Fibre Channel storage devices. The IP host
sends SCSI commands encapsulated in iSCSI protocol data units (PDUs) to a Cisco MDS 9000
Family switch IPS port over a TCP/IP connection. At this point, the commands are routed from an
IP network into a Fibre Channel network and forwarded to the intended target. Figure 37-2 depicts
the iSCSI scenarios in which the IPS module is used.

notes2


file=/etc/passwd
while IFS= read -r line; do
	echo $line
done < "$file"
