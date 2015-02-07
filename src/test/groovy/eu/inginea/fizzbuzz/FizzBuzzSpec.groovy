/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.inginea.fizzbuzz

import spock.lang.*
import eu.inginea.fizzbuzz.FizzBuzz

class FizzBuzzSpec extends Specification {
  // fields
  // fixture methods
  // feature methods
  
    @Unroll
    def "Given number #param is below one, return empty string"() {
        when:
            def result = fizzBuzzFor param;
            
        then:
            result == ''
            
        where:
            param << [0, -1, -2, -100]
    }

    @Unroll
    def "Given param bigger than 0 (#param) return string #expected"() {
        when:
            def result = fizzBuzzFor param;
            
        then:
            result == expected
            
        where:
            param | expected
             1    |  '1'
             2    |  "1,2"
    }
  
    // helper methods
    String fizzBuzzFor(int param) {
        FizzBuzz.generate(param)
    }
}