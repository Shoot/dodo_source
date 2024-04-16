package defpackage;

import defpackage.tmb;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.mindbox.dto.CustomerDto;
import ru.dodopizza.mindbox.dto.UserRequestDto;
import ru.dodopizza.mindbox.model.User;
/* compiled from: converter_ext.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"Lru/dodopizza/mindbox/model/User;", "", "brand", tmb.a.CITY_JSON_NAME, tmb.c.COUNTRY_JSON_NAME, "Lru/dodopizza/mindbox/dto/UserRequestDto;", "a", "mindbox_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: mw1  reason: default package */
/* loaded from: classes4.dex */
public final class mw1 {
    public static final UserRequestDto a(User user, String str, String str2, String str3) {
        List e;
        z65.h(user, "<this>");
        z65.h(str, "brand");
        z65.h(str2, tmb.a.CITY_JSON_NAME);
        z65.h(str3, tmb.c.COUNTRY_JSON_NAME);
        CustomerDto.Ids ids = new CustomerDto.Ids(user.getId());
        String phoneNumber = user.getPhoneNumber();
        String email = user.getEmail();
        String birthDate = user.getBirthDate();
        String fullName = user.getFullName();
        e = jc1.e(new CustomerDto.SubscriptionDto(str, "Email", user.isSubscribedToEmail()));
        return new UserRequestDto(new CustomerDto(ids, phoneNumber, email, fullName, birthDate, CustomerDto.AreaDto.Companion.build(str2, str3), e));
    }
}
