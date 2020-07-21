node('master'){
  def test = test
  
  stage ('ECHO') {
    sh """
    echo "this is echo test"
       """
  }
}
