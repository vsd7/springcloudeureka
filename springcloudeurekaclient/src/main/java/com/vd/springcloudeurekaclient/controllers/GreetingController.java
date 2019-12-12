/**
 * 
 */
package com.vd.springcloudeurekaclient.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vivek Deshmukh
 *
 */

public interface GreetingController {

	@RequestMapping("/greeting")
    String greeting();
}
