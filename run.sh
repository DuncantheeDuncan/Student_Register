mvn clean
#mvn flyway:migrate
mvn package
mvn dependency:copy-dependencies
echo 'Successfully executed the required commands'
echo 'your App is running now'
echo
echo

#java -cp .:target/*: net.greet.Greeter
java -cp .:target/*: TempRun
