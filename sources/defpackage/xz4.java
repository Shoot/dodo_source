package defpackage;

import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: InMemoryPhoneFormatRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lxz4;", "Lm28;", "", "", "Lcom/dodopizza/phonenumber/format/CountryIsoCode;", "Lj28;", "getAll", "", "a", "Ljava/util/List;", "formats", "b", "Ljava/util/Map;", "formatsMap", "<init>", "()V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: xz4  reason: default package */
/* loaded from: classes2.dex */
public final class xz4 implements m28 {
    private final List<j28> a;
    private final Map<String, j28> b;

    public xz4() {
        List<j28> o;
        int w;
        int e;
        int e2;
        o = kc1.o(new j28("+93", "AF"), new j28("+358", "AX"), new j28("+355", "AL"), new j28("+213", "DZ"), new j28("+1", "AS"), new j28("+376", "AD"), new j28("+244", "AO"), new j28("+1", "AI"), new j28("+672", "AQ"), new j28("+1", "AG"), new j28("+54", "AR"), new j28("+374", "AM"), new j28("+297", "AW"), new j28("+247", "AC"), new j28("+61", "AU"), new j28("+43", "AT"), new j28("+994", "AZ"), new j28("+1", "BS"), new j28("+973", "BH"), new j28("+880", "BD"), new j28("+1", "BB"), new j28("+375", "BY"), new j28("+32", "BE"), new j28("+501", "BZ"), new j28("+229", "BJ"), new j28("+1", "BM"), new j28("+975", "BT"), new j28("+591", "BO"), new j28("+387", "BA"), new j28("+267", "BW"), new j28("+55", "BR"), new j28("+246", "IO"), new j28("+673", "BN"), new j28("+359", "BG"), new j28("+226", "BF"), new j28("+257", "BI"), new j28("+855", "KH"), new j28("+237", "CM"), new j28("+1", "CA"), new j28("+238", "CV"), new j28("+1", "KY"), new j28("+236", "CF"), new j28("+235", "TD"), new j28("+56", "CL"), new j28("+86", "CN"), new j28("+61", "CX"), new j28("+61", "CC"), new j28("+57", "CO"), new j28("+269", "KM"), new j28("+242", "CG"), new j28("+682", "CK"), new j28("+506", "CR"), new j28("+385", "HR"), new j28("+53", "CU"), new j28("+357", "CY"), new j28("+420", "CZ"), new j28("+243", "CD"), new j28("+45", "DK"), new j28("+253", "DJ"), new j28("+1", "DM"), new j28("+1", "DO"), new j28("+593", "EC"), new j28("+20", "EG"), new j28("+503", "SV"), new j28("+240", "GQ"), new j28("+291", "ER"), new j28("+372", "EE"), new j28("+268", "SZ"), new j28("+251", "ET"), new j28("+500", "FK"), new j28("+298", "FO"), new j28("+679", "FJ"), new j28("+358", "FI"), new j28("+33", "FR"), new j28("+594", "GF"), new j28("+689", "PF"), new j28("+241", "GA"), new j28("+220", "GM"), new j28("+995", "GE"), new j28("+49", "DE"), new j28("+233", "GH"), new j28("+350", "GI"), new j28("+30", "GR"), new j28("+299", "GL"), new j28("+1", "GD"), new j28("+590", "GP"), new j28("+1", "GU"), new j28("+502", "GT"), new j28("+44", "GG"), new j28("+224", "GN"), new j28("+245", "GW"), new j28("+592", "GY"), new j28("+509", "HT"), new j28("+39", "VA"), new j28("+504", "HN"), new j28("+852", "HK"), new j28("+36", "HU"), new j28("+354", "IS"), new j28("+91", "IN"), new j28("+62", ServerDeltaTimeEntity.ID_VALUE), new j28("+98", "IR"), new j28("+924", "IQ"), new j28("+353", "IE"), new j28("+44", "IM"), new j28("+972", "IL"), new j28("+39", "IT"), new j28("+225", "CI"), new j28("+1", "JM"), new j28("+81", "JP"), new j28("+44", "JE"), new j28("+962", "JO"), new j28("+7", "KZ"), new j28("+254", "KE"), new j28("+686", "KI"), new j28("+850", "KP"), new j28("+82", "KR"), new j28("+383", "XK"), new j28("+965", "KW"), new j28("+996", "KG"), new j28("+856", "LA"), new j28("+371", "LV"), new j28("+961", "LB"), new j28("+266", "LS"), new j28("+231", "LR"), new j28("+218", "LY"), new j28("+423", "LI"), new j28("+370", "LT"), new j28("+352", "LU"), new j28("+853", "MO"), new j28("+261", "MG"), new j28("+265", "MW"), new j28("+60", "MY"), new j28("+960", "MV"), new j28("+223", "ML"), new j28("+356", "MT"), new j28("+692", "MH"), new j28("+596", "MQ"), new j28("+222", "MR"), new j28("+230", "MU"), new j28("+262", "YT"), new j28("+52", "MX"), new j28("+691", "FM"), new j28("+373", "MD"), new j28("+377", "MC"), new j28("+976", "MN"), new j28("+382", "ME"), new j28("+1", "MS"), new j28("+212", "MA"), new j28("+258", "MZ"), new j28("+95", "MM"), new j28("+224", "NA"), new j28("+674", "NR"), new j28("+977", "NP"), new j28("+31", "NL"), new j28("+687", "NC"), new j28("+24", "NZ"), new j28("+505", "NI"), new j28("+227", "NE"), new j28("+234", "NG"), new j28("+683", "NU"), new j28("+672", "NF"), new j28("+389", "MK"), new j28("+1", "MP"), new j28("+47", "NO"), new j28("+968", "OM"), new j28("+92", "PK"), new j28("+680", "PW"), new j28("+970", "PS"), new j28("+507", "PA"), new j28("+675", "PG"), new j28("+595", "PY"), new j28("+51", "PE"), new j28("+63", "PH"), new j28("+870", "PN"), new j28("+48", "PL"), new j28("+351", "PT"), new j28("+1", "PR"), new j28("+974", "QA"), new j28("+262", "RE"), new j28("+40", "RO"), new j28("+7", "RU"), new j28("+250", "RW"), new j28("+290", "SH"), new j28("+1", "KN"), new j28("+1", "LC"), new j28("+508", "PM"), new j28("+1", "VC"), new j28("+685", "WS"), new j28("+378", "SM"), new j28("+239", "ST"), new j28("+966", "SA"), new j28("+221", "SN"), new j28("+381", "RS"), new j28("+248", "SC"), new j28("+232", "SL"), new j28("+65", "SG"), new j28("+1", "SX"), new j28("+421", "SK"), new j28("+386", "SI"), new j28("+677", "SB"), new j28("+252", "SO"), new j28("+27", "ZA"), new j28("+500", "GS"), new j28("+211", "SS"), new j28("+34", "ES"), new j28("+94", "LK"), new j28("+249", "SD"), new j28("+597", "SR"), new j28("+46", "SE"), new j28("+41", "CH"), new j28("+963", "SY"), new j28("+886", "TW"), new j28("+992", "TJ"), new j28("+255", "TZ"), new j28("+66", "TH"), new j28("+670", "TL"), new j28("+228", "TG"), new j28("+690", "TK"), new j28("+676", "TO"), new j28("+1", "TT"), new j28("+216", "TN"), new j28("+90", "TR"), new j28("+993", "TM"), new j28("+1", "TC"), new j28("+688", "TV"), new j28("+256", "UG"), new j28("+380", "UA"), new j28("+971", "AE"), new j28("+44", "GB"), new j28("+1", "US"), new j28("+598", "UY"), new j28("+998", "UZ"), new j28("+678", "VU"), new j28("+58", "VE"), new j28("+84", "VN"), new j28("+1", "VG"), new j28("+1", "VI"), new j28("+681", "WF"), new j28("+967", "YE"), new j28("+260", "ZM"), new j28("+263", "ZW"));
        this.a = o;
        List<j28> list = o;
        w = lc1.w(list, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : list) {
            linkedHashMap.put(((j28) obj).a(), obj);
        }
        this.b = linkedHashMap;
    }

    @Override // defpackage.m28
    public Map<String, j28> getAll() {
        return this.b;
    }
}
