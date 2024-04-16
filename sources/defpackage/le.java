package defpackage;

import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: AndroidAutofillType.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Lm40;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Lm40;)Ljava/lang/String;", "getAndroidType$annotations", "(Lm40;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: le  reason: default package */
/* loaded from: classes.dex */
public final class le {
    private static final HashMap<m40, String> a;

    static {
        HashMap<m40, String> j;
        j = g86.j(lnb.a(m40.EmailAddress, "emailAddress"), lnb.a(m40.Username, "username"), lnb.a(m40.Password, "password"), lnb.a(m40.NewUsername, "newUsername"), lnb.a(m40.NewPassword, "newPassword"), lnb.a(m40.PostalAddress, "postalAddress"), lnb.a(m40.PostalCode, "postalCode"), lnb.a(m40.CreditCardNumber, "creditCardNumber"), lnb.a(m40.CreditCardSecurityCode, "creditCardSecurityCode"), lnb.a(m40.CreditCardExpirationDate, "creditCardExpirationDate"), lnb.a(m40.CreditCardExpirationMonth, "creditCardExpirationMonth"), lnb.a(m40.CreditCardExpirationYear, "creditCardExpirationYear"), lnb.a(m40.CreditCardExpirationDay, "creditCardExpirationDay"), lnb.a(m40.AddressCountry, "addressCountry"), lnb.a(m40.AddressRegion, "addressRegion"), lnb.a(m40.AddressLocality, "addressLocality"), lnb.a(m40.AddressStreet, "streetAddress"), lnb.a(m40.AddressAuxiliaryDetails, "extendedAddress"), lnb.a(m40.PostalCodeExtended, "extendedPostalCode"), lnb.a(m40.PersonFullName, "personName"), lnb.a(m40.PersonFirstName, "personGivenName"), lnb.a(m40.PersonLastName, "personFamilyName"), lnb.a(m40.PersonMiddleName, "personMiddleName"), lnb.a(m40.PersonMiddleInitial, "personMiddleInitial"), lnb.a(m40.PersonNamePrefix, "personNamePrefix"), lnb.a(m40.PersonNameSuffix, "personNameSuffix"), lnb.a(m40.PhoneNumber, "phoneNumber"), lnb.a(m40.PhoneNumberDevice, "phoneNumberDevice"), lnb.a(m40.PhoneCountryCode, "phoneCountryCode"), lnb.a(m40.PhoneNumberNational, "phoneNational"), lnb.a(m40.Gender, "gender"), lnb.a(m40.BirthDateFull, "birthDateFull"), lnb.a(m40.BirthDateDay, "birthDateDay"), lnb.a(m40.BirthDateMonth, "birthDateMonth"), lnb.a(m40.BirthDateYear, "birthDateYear"), lnb.a(m40.SmsOtpCode, "smsOTPCode"));
        a = j;
    }

    public static final String a(m40 m40Var) {
        z65.h(m40Var, "<this>");
        String str = a.get(m40Var);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
