node('master') {
  def test = test
  
  stage('Checkout') {
        checkout scm
        dir("TEST-${test}") {
            deleteDir()
            git branch: 'master', url: "https://github.com/Nimble85/Selenium_k8s.git"

          }
      }



}
