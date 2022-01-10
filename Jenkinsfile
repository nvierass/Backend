pipeline {
	agent any
	stages {
		stage ('Retrieve'){
			steps {
				git branch: 'main',  url: 'https://github.com/nvierass/Backend'
			}
		}
		stage ('JUnit testing'){
			steps{
				withGradle {
					sh 'chmod +x gradlew'
					sh './gradlew test'
					junit 'build\test-results\test\testTEST-Mingeso.Evaluacion2.ProductoTests.xml'
				}
			}
		}
		stage ('Sonarqube analisis'){
			steps {
				withGradle {
					sh 'chmod +x gradlew'
					sh './gradlew sonarqube'
				}
			}
		}
		stage('Image creation'){
			steps{
				script{
					sh 'docker build . -t nvierass/mingeso:backend-mingeso-g4'
					sh 'docker push nvierass/mingeso:backend-mingeso-g4'
				}
			}
		}
	}
}
