#Build script

#cd into the home dir
cd ~/projects/gardenhelper/

#Clean up
rm -rf build
rm -rf dist

#create the needed directories
mkdir -m 770 -p dist
mkdir -m 770 -p build/classes

#Rmove the R.java file as will be created by aapt
rm com.bonginc.gardenhelper/R.java 

#Now use aapt
echo Create the R.java file
aapt p -f -v -M AndroidManifest.xml -F ./build/resources.res -I ~/system/classes/android.jar -S res/ -J src/com/bonginc/gardenhelper

#cd into the src dir
cd src

#Now compile - note the use of a seperate lib (in non-dex format!)
echo Compile the java code
javac -verbose -cp ../libs/demolib.jar -d ../build/classes com/bonginc/gardenhelper/MainActivity.java 

#Back out
cd ..

#Now into build dir
cd build/classes/

#Now convert to dex format (need --no-strict) (Notice demolib.jar at the end - non-dex format)
echo Now convert to dex format
dx --dex --verbose --no-strict --output=../gardenhelper.dex com ../../libs/demolib.jar

#Back out
cd ../..

#And finally - create the .apk
apkbuilder ./dist/gardenhelper.apk -v -u -z ./build/resources.res -f ./build/gardenhelper.dex 

#And now sign it
cd dist
signer gardenhelper.apk gardenhelper_signed.apk

cd ..

