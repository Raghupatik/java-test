package com.example.sample;


public class GreetingController {
    public String greeting() {
        const response = {
                statusCode: 200,
                headers: {
                    'Content-Type': "application/json"
                },
                body: JSON.stringify({
                    name: "Lambda is Executed Successfully with Version 1.0.3 !!"
                })
        };
        return response;
    }
}
