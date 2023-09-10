
# Regex Generative AI

The RegEx Generative AI project is an experimental project that proves we don't need artificial intelligence to implement various solutions. Overall, only StringUtils class is implemented here and you can reuse its methods.



## StringUtils class

#### isStrongPassword(String password, int length)`
`password` - the input string to match the rules

`length` - the maximum defined password length

This specific method of the StringUtils class can come in handy to verify whether the password is strong enough. The password is strong only if:
- it contains at least one lower character
- it contains at least one upper character
- it contains at least one digit
- it doesn't contain whitespace characters

## Run Locally

Clone the project

```bash
  git clone https://github.com/antoshaSid/regex-generative-ai.git
```

Go to the project directory

```bash
  cd regex-generative-ai
```

Build the project

```bash
  mvn package 
```

Run the project

```bash
  java -jar target/regex-generative-ai-1.0-SNAPSHOT.jar
```

