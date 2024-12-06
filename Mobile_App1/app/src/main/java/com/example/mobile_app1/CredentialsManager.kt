package com.example.mobile_app1

class CredentialsManager {
    private val emailPattern = ("[a-zA-Z0-9\\+\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][0-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][0-zA-Z0-9\\-]{0,25}" +
            ")+").toRegex()

    fun isEmailValid(email: String): Boolean {
        return email.matches(emailPattern)
    }

    fun isValidPassword(password: String): Boolean {
        return password.length >= 8
    }

    fun validateCredentials(email: String, password: String, isCheckboxChecked: Boolean): Boolean {
        return isEmailValid(email) && isValidPassword(password) && isCheckboxChecked
    }
    fun validFullName(fullName: String) : Boolean{
        return fullName.isNotEmpty()
    }
    fun validPhoneNumber(phoneNumber: String): Boolean{
        return phoneNumber.isNotEmpty()
    }
    fun termsAccepted(isCheck: Boolean): Boolean{
        return isCheck
    }
    fun ValidateCredentialsForSignUp(
        fullName: String, email: String, phoneNumber: String,
        password: String, isCheck: Boolean
    ) : Boolean{
        return validFullName(fullName) && isEmailValid(email) && isValidPassword(password) &&
                validPhoneNumber(phoneNumber) && termsAccepted(isCheck)
    }


}