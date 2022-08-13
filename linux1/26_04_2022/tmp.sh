#!/bin/bash
"""
this script will create a backup of the current directory and place it in the /temp directory
in the format user_name_home_year-month-date-hour-minute-second
"""
user=$(whoami)
input=$(pwd)
output=/temp${user}_home_$(date +%y-%m-%d_%h%m%s).tar.gz
tar -czf $output $input
echo "backup of $input is completed"