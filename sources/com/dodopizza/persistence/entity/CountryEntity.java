package com.dodopizza.persistence.entity;

import ch.qos.logback.core.joran.action.Action;
import com.appsflyer.AppsFlyerProperties;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CountryEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0017\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZBý\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030%\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u00106\u001a\u00020\u0003\u0012\b\b\u0002\u00109\u001a\u00020\u0003\u0012\b\b\u0002\u0010<\u001a\u00020\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0003\u0012\b\b\u0002\u0010B\u001a\u00020\u0003\u0012\b\b\u0002\u0010E\u001a\u00020/\u0012\b\b\u0002\u0010I\u001a\u00020H\u0012\b\b\u0002\u0010O\u001a\u00020H\u0012\b\b\u0002\u0010R\u001a\u00020H\u0012\b\b\u0002\u0010U\u001a\u00020H¢\u0006\u0004\bX\u0010YR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\"\u00100\u001a\u00020/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0005\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\"\u00109\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0005\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\"\u0010<\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0005\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\"\u0010?\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0005\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\"\u0010B\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0005\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\"\u0010E\u001a\u00020/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u00101\u001a\u0004\bF\u00103\"\u0004\bG\u00105R\"\u0010I\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010O\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010J\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR\"\u0010R\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010J\u001a\u0004\bS\u0010L\"\u0004\bT\u0010NR\"\u0010U\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010J\u001a\u0004\bV\u0010L\"\u0004\bW\u0010N¨\u0006["}, d2 = {"Lcom/dodopizza/persistence/entity/CountryEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "code", "getCode", "setCode", "isoName", "getIsoName", "setIsoName", AppsFlyerProperties.CURRENCY_CODE, "getCurrencyCode", "setCurrencyCode", "customSymbol", "getCustomSymbol", "setCustomSymbol", "phoneCode", "getPhoneCode", "setPhoneCode", "phoneMask", "getPhoneMask", "setPhoneMask", "feedbackPhone", "getFeedbackPhone", "setFeedbackPhone", "feedbackEmail", "getFeedbackEmail", "setFeedbackEmail", "Lio/realm/k0;", "languages", "Lio/realm/k0;", "getLanguages", "()Lio/realm/k0;", "setLanguages", "(Lio/realm/k0;)V", "features", "getFeatures", "setFeatures", "", "state", "I", "getState", "()I", "setState", "(I)V", "controllingWebsite", "getControllingWebsite", "setControllingWebsite", "generalWebsite", "getGeneralWebsite", "setGeneralWebsite", "recruitingWebsite", "getRecruitingWebsite", "setRecruitingWebsite", "noGloves", "getNoGloves", "setNoGloves", "baseUrl", "getBaseUrl", "setBaseUrl", BonusActionEntity.ORDER, "getOrder", "setOrder", "", "mapBoundsUpperLeftCornerLat", "D", "getMapBoundsUpperLeftCornerLat", "()D", "setMapBoundsUpperLeftCornerLat", "(D)V", "mapBoundsUpperLeftCornerLon", "getMapBoundsUpperLeftCornerLon", "setMapBoundsUpperLeftCornerLon", "mapBoundsLowerRightCornerLat", "getMapBoundsLowerRightCornerLat", "setMapBoundsLowerRightCornerLat", "mapBoundsLowerRightCornerLon", "getMapBoundsLowerRightCornerLon", "setMapBoundsLowerRightCornerLon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDDD)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CountryEntity extends n0 implements yi3, sec {
    public static final Companion Companion = new Companion(null);
    public static final int STATE_CLOSED = 1;
    public static final int STATE_LANDING = 2;
    public static final int STATE_OPEN = 3;
    private String baseUrl;
    private String code;
    private String controllingWebsite;
    private String currencyCode;
    private String customSymbol;
    private k0<String> features;
    private String feedbackEmail;
    private String feedbackPhone;
    private String generalWebsite;
    private String id;
    private String isoName;
    private k0<String> languages;
    private double mapBoundsLowerRightCornerLat;
    private double mapBoundsLowerRightCornerLon;
    private double mapBoundsUpperLeftCornerLat;
    private double mapBoundsUpperLeftCornerLon;
    private String name;
    private String noGloves;
    private int order;
    private String phoneCode;
    private String phoneMask;
    private String recruitingWebsite;
    private int state;

    /* compiled from: CountryEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/CountryEntity$Companion;", "", "()V", "STATE_CLOSED", "", "STATE_LANDING", "STATE_OPEN", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CountryEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 8388607, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getBaseUrl() {
        return realmGet$baseUrl();
    }

    public String getCode() {
        return realmGet$code();
    }

    public String getControllingWebsite() {
        return realmGet$controllingWebsite();
    }

    public String getCurrencyCode() {
        return realmGet$currencyCode();
    }

    public String getCustomSymbol() {
        return realmGet$customSymbol();
    }

    public k0<String> getFeatures() {
        return realmGet$features();
    }

    public String getFeedbackEmail() {
        return realmGet$feedbackEmail();
    }

    public String getFeedbackPhone() {
        return realmGet$feedbackPhone();
    }

    public String getGeneralWebsite() {
        return realmGet$generalWebsite();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getIsoName() {
        return realmGet$isoName();
    }

    public k0<String> getLanguages() {
        return realmGet$languages();
    }

    public double getMapBoundsLowerRightCornerLat() {
        return realmGet$mapBoundsLowerRightCornerLat();
    }

    public double getMapBoundsLowerRightCornerLon() {
        return realmGet$mapBoundsLowerRightCornerLon();
    }

    public double getMapBoundsUpperLeftCornerLat() {
        return realmGet$mapBoundsUpperLeftCornerLat();
    }

    public double getMapBoundsUpperLeftCornerLon() {
        return realmGet$mapBoundsUpperLeftCornerLon();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getNoGloves() {
        return realmGet$noGloves();
    }

    public int getOrder() {
        return realmGet$order();
    }

    public String getPhoneCode() {
        return realmGet$phoneCode();
    }

    public String getPhoneMask() {
        return realmGet$phoneMask();
    }

    public String getRecruitingWebsite() {
        return realmGet$recruitingWebsite();
    }

    public int getState() {
        return realmGet$state();
    }

    @Override // defpackage.sec
    public String realmGet$baseUrl() {
        return this.baseUrl;
    }

    @Override // defpackage.sec
    public String realmGet$code() {
        return this.code;
    }

    @Override // defpackage.sec
    public String realmGet$controllingWebsite() {
        return this.controllingWebsite;
    }

    @Override // defpackage.sec
    public String realmGet$currencyCode() {
        return this.currencyCode;
    }

    @Override // defpackage.sec
    public String realmGet$customSymbol() {
        return this.customSymbol;
    }

    @Override // defpackage.sec
    public k0 realmGet$features() {
        return this.features;
    }

    @Override // defpackage.sec
    public String realmGet$feedbackEmail() {
        return this.feedbackEmail;
    }

    @Override // defpackage.sec
    public String realmGet$feedbackPhone() {
        return this.feedbackPhone;
    }

    @Override // defpackage.sec
    public String realmGet$generalWebsite() {
        return this.generalWebsite;
    }

    @Override // defpackage.sec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.sec
    public String realmGet$isoName() {
        return this.isoName;
    }

    @Override // defpackage.sec
    public k0 realmGet$languages() {
        return this.languages;
    }

    @Override // defpackage.sec
    public double realmGet$mapBoundsLowerRightCornerLat() {
        return this.mapBoundsLowerRightCornerLat;
    }

    @Override // defpackage.sec
    public double realmGet$mapBoundsLowerRightCornerLon() {
        return this.mapBoundsLowerRightCornerLon;
    }

    @Override // defpackage.sec
    public double realmGet$mapBoundsUpperLeftCornerLat() {
        return this.mapBoundsUpperLeftCornerLat;
    }

    @Override // defpackage.sec
    public double realmGet$mapBoundsUpperLeftCornerLon() {
        return this.mapBoundsUpperLeftCornerLon;
    }

    @Override // defpackage.sec
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.sec
    public String realmGet$noGloves() {
        return this.noGloves;
    }

    @Override // defpackage.sec
    public int realmGet$order() {
        return this.order;
    }

    @Override // defpackage.sec
    public String realmGet$phoneCode() {
        return this.phoneCode;
    }

    @Override // defpackage.sec
    public String realmGet$phoneMask() {
        return this.phoneMask;
    }

    @Override // defpackage.sec
    public String realmGet$recruitingWebsite() {
        return this.recruitingWebsite;
    }

    @Override // defpackage.sec
    public int realmGet$state() {
        return this.state;
    }

    @Override // defpackage.sec
    public void realmSet$baseUrl(String str) {
        this.baseUrl = str;
    }

    @Override // defpackage.sec
    public void realmSet$code(String str) {
        this.code = str;
    }

    @Override // defpackage.sec
    public void realmSet$controllingWebsite(String str) {
        this.controllingWebsite = str;
    }

    @Override // defpackage.sec
    public void realmSet$currencyCode(String str) {
        this.currencyCode = str;
    }

    @Override // defpackage.sec
    public void realmSet$customSymbol(String str) {
        this.customSymbol = str;
    }

    @Override // defpackage.sec
    public void realmSet$features(k0 k0Var) {
        this.features = k0Var;
    }

    @Override // defpackage.sec
    public void realmSet$feedbackEmail(String str) {
        this.feedbackEmail = str;
    }

    @Override // defpackage.sec
    public void realmSet$feedbackPhone(String str) {
        this.feedbackPhone = str;
    }

    @Override // defpackage.sec
    public void realmSet$generalWebsite(String str) {
        this.generalWebsite = str;
    }

    @Override // defpackage.sec
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.sec
    public void realmSet$isoName(String str) {
        this.isoName = str;
    }

    @Override // defpackage.sec
    public void realmSet$languages(k0 k0Var) {
        this.languages = k0Var;
    }

    @Override // defpackage.sec
    public void realmSet$mapBoundsLowerRightCornerLat(double d) {
        this.mapBoundsLowerRightCornerLat = d;
    }

    @Override // defpackage.sec
    public void realmSet$mapBoundsLowerRightCornerLon(double d) {
        this.mapBoundsLowerRightCornerLon = d;
    }

    @Override // defpackage.sec
    public void realmSet$mapBoundsUpperLeftCornerLat(double d) {
        this.mapBoundsUpperLeftCornerLat = d;
    }

    @Override // defpackage.sec
    public void realmSet$mapBoundsUpperLeftCornerLon(double d) {
        this.mapBoundsUpperLeftCornerLon = d;
    }

    @Override // defpackage.sec
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.sec
    public void realmSet$noGloves(String str) {
        this.noGloves = str;
    }

    @Override // defpackage.sec
    public void realmSet$order(int i) {
        this.order = i;
    }

    @Override // defpackage.sec
    public void realmSet$phoneCode(String str) {
        this.phoneCode = str;
    }

    @Override // defpackage.sec
    public void realmSet$phoneMask(String str) {
        this.phoneMask = str;
    }

    @Override // defpackage.sec
    public void realmSet$recruitingWebsite(String str) {
        this.recruitingWebsite = str;
    }

    @Override // defpackage.sec
    public void realmSet$state(int i) {
        this.state = i;
    }

    public void setBaseUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$baseUrl(str);
    }

    public void setCode(String str) {
        z65.h(str, "<set-?>");
        realmSet$code(str);
    }

    public void setControllingWebsite(String str) {
        z65.h(str, "<set-?>");
        realmSet$controllingWebsite(str);
    }

    public void setCurrencyCode(String str) {
        z65.h(str, "<set-?>");
        realmSet$currencyCode(str);
    }

    public void setCustomSymbol(String str) {
        realmSet$customSymbol(str);
    }

    public void setFeatures(k0<String> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$features(k0Var);
    }

    public void setFeedbackEmail(String str) {
        z65.h(str, "<set-?>");
        realmSet$feedbackEmail(str);
    }

    public void setFeedbackPhone(String str) {
        z65.h(str, "<set-?>");
        realmSet$feedbackPhone(str);
    }

    public void setGeneralWebsite(String str) {
        z65.h(str, "<set-?>");
        realmSet$generalWebsite(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setIsoName(String str) {
        z65.h(str, "<set-?>");
        realmSet$isoName(str);
    }

    public void setLanguages(k0<String> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$languages(k0Var);
    }

    public void setMapBoundsLowerRightCornerLat(double d) {
        realmSet$mapBoundsLowerRightCornerLat(d);
    }

    public void setMapBoundsLowerRightCornerLon(double d) {
        realmSet$mapBoundsLowerRightCornerLon(d);
    }

    public void setMapBoundsUpperLeftCornerLat(double d) {
        realmSet$mapBoundsUpperLeftCornerLat(d);
    }

    public void setMapBoundsUpperLeftCornerLon(double d) {
        realmSet$mapBoundsUpperLeftCornerLon(d);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setNoGloves(String str) {
        z65.h(str, "<set-?>");
        realmSet$noGloves(str);
    }

    public void setOrder(int i) {
        realmSet$order(i);
    }

    public void setPhoneCode(String str) {
        z65.h(str, "<set-?>");
        realmSet$phoneCode(str);
    }

    public void setPhoneMask(String str) {
        z65.h(str, "<set-?>");
        realmSet$phoneMask(str);
    }

    public void setRecruitingWebsite(String str) {
        z65.h(str, "<set-?>");
        realmSet$recruitingWebsite(str);
    }

    public void setState(int i) {
        realmSet$state(i);
    }

    public /* synthetic */ CountryEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, k0 k0Var, k0 k0Var2, int i, String str11, String str12, String str13, String str14, String str15, int i2, double d, double d2, double d3, double d4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) == 0 ? str6 : null, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "" : str8, (i3 & 256) != 0 ? "" : str9, (i3 & 512) != 0 ? "" : str10, (i3 & 1024) != 0 ? new k0() : k0Var, (i3 & 2048) != 0 ? new k0() : k0Var2, (i3 & 4096) != 0 ? 1 : i, (i3 & 8192) != 0 ? "" : str11, (i3 & 16384) != 0 ? "" : str12, (i3 & 32768) != 0 ? "" : str13, (i3 & 65536) != 0 ? "" : str14, (i3 & 131072) != 0 ? "" : str15, (i3 & 262144) != 0 ? Integer.MAX_VALUE : i2, (i3 & 524288) != 0 ? 0.0d : d, (i3 & 1048576) != 0 ? 0.0d : d2, (i3 & 2097152) != 0 ? 0.0d : d3, (i3 & 4194304) == 0 ? d4 : 0.0d);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CountryEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, k0<String> k0Var, k0<String> k0Var2, int i, String str11, String str12, String str13, String str14, String str15, int i2, double d, double d2, double d3, double d4) {
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "code");
        z65.h(str4, "isoName");
        z65.h(str5, AppsFlyerProperties.CURRENCY_CODE);
        z65.h(str7, "phoneCode");
        z65.h(str8, "phoneMask");
        z65.h(str9, "feedbackPhone");
        z65.h(str10, "feedbackEmail");
        z65.h(k0Var, "languages");
        z65.h(k0Var2, "features");
        z65.h(str11, "controllingWebsite");
        z65.h(str12, "generalWebsite");
        z65.h(str13, "recruitingWebsite");
        z65.h(str14, "noGloves");
        z65.h(str15, "baseUrl");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$name(str2);
        realmSet$code(str3);
        realmSet$isoName(str4);
        realmSet$currencyCode(str5);
        realmSet$customSymbol(str6);
        realmSet$phoneCode(str7);
        realmSet$phoneMask(str8);
        realmSet$feedbackPhone(str9);
        realmSet$feedbackEmail(str10);
        realmSet$languages(k0Var);
        realmSet$features(k0Var2);
        realmSet$state(i);
        realmSet$controllingWebsite(str11);
        realmSet$generalWebsite(str12);
        realmSet$recruitingWebsite(str13);
        realmSet$noGloves(str14);
        realmSet$baseUrl(str15);
        realmSet$order(i2);
        realmSet$mapBoundsUpperLeftCornerLat(d);
        realmSet$mapBoundsUpperLeftCornerLon(d2);
        realmSet$mapBoundsLowerRightCornerLat(d3);
        realmSet$mapBoundsLowerRightCornerLon(d4);
    }
}
