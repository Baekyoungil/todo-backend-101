./gradlew clean build
docker build --build-arg JAR_FILE=build/libs/\*.jar -t backend .
docker run -d -p 8080:8080 backend
