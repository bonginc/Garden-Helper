#Install the apk

#Remove the Old
if [ -f /sdcard/gardenhelper_signed.apk ];then
	rm /sdcard/gardenhelper_signed.apk
fi

#Only works if APK is on the sdcard
cp ./dist/gardenhelper_signed.apk /sdcard/

#Now try and view it..
am start -a android.intent.action.VIEW -t application/vnd.android.package-archive -d file:///sdcard/gardenhelper_signed.apk
