/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.inginea.spockkata

import spock.lang.*

class DummySpec extends Specification {
  // fields
  // fixture methods
  // feature methods
  
    def "First dummy test fails"() {
        given:
            def ok = null
            
        when:
            ok = false
            
        then:
            ok
    }
  // helper methods
}