package ru.dodopizza.app.presentation.checkout.details;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.order.feature.checkout.presentation.OrderReceivingTypeHolder;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c41;
import defpackage.d41;
import defpackage.ei7;
import defpackage.fx2;
import defpackage.k6;
import defpackage.ok9;
import defpackage.qv5;
import defpackage.sk9;
import defpackage.sx6;
import defpackage.u31;
import defpackage.wo7;
import defpackage.z6a;
import defpackage.zo7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.checkout.details.b;
import ru.dodopizza.app.presentation.checkout.details.c;
import ru.dodopizza.app.presentation.checkout.details.deferredtime.adapter.DeferredTimeViewHolder;
import ru.dodopizza.app.presentation.checkout.details.views.OrderTypeView;
import ru.dodopizza.app.presentation.checkout.details.views.PaymentMethodView;
/* compiled from: CheckoutDetailsFragment.kt */
@Metadata(d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 î\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002ï\u0002B\t¢\u0006\u0006\bì\u0002\u0010í\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\f\u0010\u0017\u001a\u00020\u0005*\u00020\u0012H\u0002J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0002J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0002J\u0012\u00100\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020,H\u0002J\u0010\u00101\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,H\u0002J \u00106\u001a\u00020\u00052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020,H\u0002J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000fH\u0002J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0016J\u001a\u0010@\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0012H\u0016J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0012H\u0016J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020DH\u0016J\b\u0010G\u001a\u00020,H\u0016J(\u0010N\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u000fH\u0016J\u0010\u0010P\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u000fH\u0016J\u0010\u0010R\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u000fH\u0016J\u0018\u0010U\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020SH\u0016J\u0010\u0010V\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u000fH\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020WH\u0016J\u0010\u0010\\\u001a\u00020\u00052\u0006\u0010[\u001a\u00020ZH\u0016J\b\u0010]\u001a\u00020\u0005H\u0016J\b\u0010^\u001a\u00020\u0005H\u0016J\b\u0010_\u001a\u00020\u0005H\u0016J\u0010\u0010a\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u000fH\u0016J\b\u0010b\u001a\u00020\u0005H\u0016J\u0016\u0010d\u001a\u00020\u00052\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00180\u000bH\u0016J\b\u0010e\u001a\u00020\u0005H\u0016J\b\u0010f\u001a\u00020\u0005H\u0016J\b\u0010g\u001a\u00020\u0005H\u0016J\b\u0010h\u001a\u00020\u0005H\u0016J\b\u0010i\u001a\u00020\u0005H\u0016J\b\u0010j\u001a\u00020\u0005H\u0016J\b\u0010k\u001a\u00020\u0005H\u0016J\b\u0010l\u001a\u00020\u0005H\u0016J\b\u0010m\u001a\u00020\u0005H\u0016J\b\u0010n\u001a\u00020\u0005H\u0016J\b\u0010o\u001a\u00020\u0005H\u0016R\u001c\u0010t\u001a\n q*\u0004\u0018\u00010p0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001b\u0010y\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010v\u001a\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010v\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010v\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u008b\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010v\u001a\u0005\b\u008a\u0001\u0010xR \u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010v\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010v\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u009a\u0001\u001a\u00030\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0097\u0001\u0010v\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010\u009d\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010v\u001a\u0005\b\u009c\u0001\u0010xR\u001e\u0010 \u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010v\u001a\u0005\b\u009f\u0001\u0010xR\u001e\u0010£\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010v\u001a\u0005\b¢\u0001\u0010xR\u001e\u0010¦\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¤\u0001\u0010v\u001a\u0005\b¥\u0001\u0010xR\u001e\u0010©\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b§\u0001\u0010v\u001a\u0005\b¨\u0001\u0010xR \u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010v\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001e\u0010±\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010v\u001a\u0005\b°\u0001\u0010xR\u001e\u0010´\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b²\u0001\u0010v\u001a\u0005\b³\u0001\u0010xR\u001e\u0010·\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010v\u001a\u0005\b¶\u0001\u0010xR\u001e\u0010º\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¸\u0001\u0010v\u001a\u0005\b¹\u0001\u0010xR\u001e\u0010½\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b»\u0001\u0010v\u001a\u0005\b¼\u0001\u0010xR\u001e\u0010À\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¾\u0001\u0010v\u001a\u0005\b¿\u0001\u0010xR\u001e\u0010Ã\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010v\u001a\u0005\bÂ\u0001\u0010xR\u001f\u0010Æ\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÄ\u0001\u0010v\u001a\u0006\bÅ\u0001\u0010\u0082\u0001R\u001e\u0010É\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010v\u001a\u0005\bÈ\u0001\u0010xR\u001f\u0010Ì\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÊ\u0001\u0010v\u001a\u0006\bË\u0001\u0010\u0082\u0001R\u001f\u0010Ï\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÍ\u0001\u0010v\u001a\u0006\bÎ\u0001\u0010\u0082\u0001R\u001f\u0010Ò\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÐ\u0001\u0010v\u001a\u0006\bÑ\u0001\u0010\u0082\u0001R\u001e\u0010Õ\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bÓ\u0001\u0010v\u001a\u0005\bÔ\u0001\u0010xR\u001e\u0010Ø\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bÖ\u0001\u0010v\u001a\u0005\b×\u0001\u0010xR\u001f\u0010Û\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÙ\u0001\u0010v\u001a\u0006\bÚ\u0001\u0010\u0082\u0001R\u001f\u0010Þ\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÜ\u0001\u0010v\u001a\u0006\bÝ\u0001\u0010\u0082\u0001R\u001e\u0010á\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bß\u0001\u0010v\u001a\u0005\bà\u0001\u0010xR \u0010æ\u0001\u001a\u00030â\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bã\u0001\u0010v\u001a\u0006\bä\u0001\u0010å\u0001R\u001e\u0010é\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bç\u0001\u0010v\u001a\u0005\bè\u0001\u0010xR\u001e\u0010ì\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bê\u0001\u0010v\u001a\u0005\bë\u0001\u0010xR\u001f\u0010ï\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bí\u0001\u0010v\u001a\u0006\bî\u0001\u0010\u0082\u0001R\u001e\u0010ò\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bð\u0001\u0010v\u001a\u0005\bñ\u0001\u0010}R\u001e\u0010õ\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bó\u0001\u0010v\u001a\u0005\bô\u0001\u0010xR\u001f\u0010ø\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bö\u0001\u0010v\u001a\u0006\b÷\u0001\u0010\u0082\u0001R\u001e\u0010û\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bù\u0001\u0010v\u001a\u0005\bú\u0001\u0010xR\u001f\u0010þ\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bü\u0001\u0010v\u001a\u0006\bý\u0001\u0010\u0082\u0001R\u001f\u0010\u0081\u0002\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÿ\u0001\u0010v\u001a\u0006\b\u0080\u0002\u0010\u0082\u0001R \u0010\u0086\u0002\u001a\u00030\u0082\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0002\u0010v\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001e\u0010\u0089\u0002\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010v\u001a\u0005\b\u0088\u0002\u0010xR\u001f\u0010\u008c\u0002\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0002\u0010v\u001a\u0006\b\u008b\u0002\u0010\u0082\u0001R\u001e\u0010\u008f\u0002\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010v\u001a\u0005\b\u008e\u0002\u0010xR\u001e\u0010\u0092\u0002\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0002\u0010v\u001a\u0005\b\u0091\u0002\u0010xR \u0010\u0097\u0002\u001a\u00030\u0093\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0002\u0010v\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001f\u0010\u009a\u0002\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0002\u0010v\u001a\u0006\b\u0099\u0002\u0010\u0082\u0001R\u001f\u0010\u009d\u0002\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009b\u0002\u0010v\u001a\u0006\b\u009c\u0002\u0010\u0082\u0001R\u001f\u0010 \u0002\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009e\u0002\u0010v\u001a\u0006\b\u009f\u0002\u0010\u0082\u0001R*\u0010¨\u0002\u001a\u00030¡\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R*\u0010°\u0002\u001a\u00030©\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0002\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R*\u0010¸\u0002\u001a\u00030±\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0002\u0010³\u0002\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0006\b¶\u0002\u0010·\u0002R)\u0010¿\u0002\u001a\u00030¹\u00028\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bB\u0010º\u0002\u001a\u0006\b»\u0002\u0010¼\u0002\"\u0006\b½\u0002\u0010¾\u0002R*\u0010Ç\u0002\u001a\u00030À\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002\"\u0006\bÅ\u0002\u0010Æ\u0002R*\u0010Ï\u0002\u001a\u00030È\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÉ\u0002\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002\"\u0006\bÍ\u0002\u0010Î\u0002R1\u0010Ø\u0002\u001a\n\u0012\u0005\u0012\u00030Ñ\u00020Ð\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0002\u0010Ó\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002R*\u0010à\u0002\u001a\u00030Ù\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÚ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002\"\u0006\bÞ\u0002\u0010ß\u0002R \u0010ä\u0002\u001a\t\u0012\u0004\u0012\u00020\f0á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0002\u0010ã\u0002R \u0010æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u001c0á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0002\u0010ã\u0002R*\u0010ë\u0002\u001a\f q*\u0005\u0018\u00010Ñ\u00020Ñ\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bç\u0002\u0010è\u0002\u001a\u0006\bé\u0002\u0010ê\u0002¨\u0006ð\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/c;", "Lc70;", "Lw41;", "Lw50;", "Lbl2;", "", "Hi", "Ii", "Lsx6;", "state", "Li", "", "Lsx6$a;", "times", "Mi", "", "paymentMethodsWarning", "Ui", "Lb61;", "Oi", "Lwk7;", "orderTypeState", "Ni", "Pi", "Lok9;", "serviceType", "Lzo7;", "packagingState", "Lei7;", "wh", "Lwo7;", "packageSelector", "xh", "Lwo7$b;", "switcherConfig", "yh", "Lu31;", "action", "Qi", "Lin6;", "moneyDetails", "Ti", "Ld41;", "error", "", "unknownErrorContainsFeedbackEmail", "Ri", "withProgress", "Vi", "Fi", "Lhn6;", "reminder", "containsGoods", "goodsIncludedIntoMinDeliveryPrice", "Si", "description", "R9", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "model", "v5", "V3", "", "index", "f6", "onBackPressed", "paymentId", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "paymentDataRequest", "Lz41;", "googlePayListener", "env", "Y3", "deepLink", "Rb", RemoteMessageConst.Notification.URL, "Q5", "Lhu9;", "sbpBank", "x1", "lc", "", "data", "ve", "Lik3;", "errorMessage", "V8", "L8", "Tc", "a7", "discount", "P0", "W", "serviceTypes", "E6", "Wd", "C8", "Zf", "k2", "jf", "I1", "P9", "Df", "Mb", "O2", "T6", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "i", "Lk79;", "Fh", "()Landroid/view/View;", "deferredTimeContainer", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Hh", "()Landroidx/recyclerview/widget/RecyclerView;", "deferredTimeRecycler", "Landroid/widget/TextView;", "k", "Gh", "()Landroid/widget/TextView;", "deferredTimeError", "Landroidx/core/widget/NestedScrollView;", "l", "Ch", "()Landroidx/core/widget/NestedScrollView;", "checkoutDetailsContainer", Image.TYPE_MEDIUM, "Ci", "summaryContainer", "Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeView;", "n", "Yh", "()Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeView;", "orderTypeView", "Lru/dodopizza/app/presentation/checkout/details/views/PaymentMethodView;", "o", "ji", "()Lru/dodopizza/app/presentation/checkout/details/views/PaymentMethodView;", "paymentMethodView", "Landroid/view/ViewGroup;", "p", "Bh", "()Landroid/view/ViewGroup;", "buttonsContainer", "q", "ei", "payWithGooglePayButton", "r", "fi", "payWithGooglePayButtonContainer", Image.TYPE_SMALL, "hi", "payWithSberPayButton", "t", "gi", "payWithKaspiPayButton", "u", "ii", "payWithSbpPayButton", "Lcom/dodopizza/android/buttons/DodoButton;", "v", "ni", "()Lcom/dodopizza/android/buttons/DodoButton;", "placeOrderButton", "w", "Lh", "disablePlaceOrderButton", "x", "Ah", "addNotesButton", "y", "Ai", "selectPizzeriaButton", "z", "zh", "addDeliveryLocationButton", "A", "Dh", "continueToDeliveryLocationDetailsButton", "B", "yi", "selectDeferredTimeButton", "I", "zi", "selectPaymentButton", "X", "Rh", "minDeliveryPriceButton", "Y", "Sh", "minDeliveryPriceContainer", "Z", "Th", "minDeliveryPriceGoodsLabel", "S4", "Ei", "titleGoodsAmount", "T4", "Ph", "goodsTotalAmount", "U4", "Bi", "snackbarAnchor", "V4", "Nh", "discountContainer", "W4", "Mh", "discountAmount", "X4", "Wh", "orderTotalAmount", "Y4", "Uh", "moneyDetailsContainer", "Landroidx/appcompat/widget/AppCompatTextView;", "Z4", "Xh", "()Landroidx/appcompat/widget/AppCompatTextView;", "orderTypeTitle", "a5", "di", "packagingView", "b5", "Kh", "deliveryFeeContainer", "c5", "Jh", "deliveryFeeAmount", "d5", "Vh", "orderReceivingList", "e5", "qi", "reusablePackageContainer", "f5", "vi", "reusablePackageTitle", "g5", "si", "reusablePackageInfoCard", "h5", "ri", "reusablePackageInfoAction", "i5", "ti", "reusablePackageInfoDescription", "Landroidx/appcompat/widget/SwitchCompat;", "j5", "ui", "()Landroidx/appcompat/widget/SwitchCompat;", "reusablePackageSwitcher", "k5", "ki", "paymentMethodsWarningContainer", "l5", "li", "paymentMethodsWarningText", "m5", "Gi", "vpnWarningContainer", "n5", "mi", "paymentProgressIndicator", "Lcom/google/android/material/card/MaterialCardView;", "o5", "ai", "()Lcom/google/android/material/card/MaterialCardView;", "overloadModeContainer", "p5", "ci", "overloadModeTitle", "q5", "bi", "overloadModeText", "r5", "Zh", "overloadModeButton", "Lpv9;", "s5", "Lpv9;", "xi", "()Lpv9;", "setScheduleHelper", "(Lpv9;)V", "scheduleHelper", "Ltg4;", "t5", "Ltg4;", "Qh", "()Ltg4;", "setGooglePayController", "(Ltg4;)V", "googlePayController", "Lvs2;", "u5", "Lvs2;", "Di", "()Lvs2;", "setTimeFormatter", "(Lvs2;)V", "timeFormatter", "Lpu2;", "Lpu2;", "Ih", "()Lpu2;", "setDeliverablePlaceFormatter", "(Lpu2;)V", "deliverablePlaceFormatter", "Lyt9;", "w5", "Lyt9;", "wi", "()Lyt9;", "setSberPayIntentBuilder", "(Lyt9;)V", "sberPayIntentBuilder", "Lje4;", "x5", "Lje4;", "Oh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "y5", "Las8;", "pi", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lay1;", "z5", "Lay1;", "Eh", "()Lay1;", "setCurrentCountry", "(Lay1;)V", "currentCountry", "Ll6;", "A5", "Ll6;", "timesAdapter", "B5", "orderReceivingTypes", "C5", "Lmoxy/ktx/MoxyKtxDelegate;", "oi", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "<init>", "()V", "D5", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c extends c70 implements w41, w50, bl2 {
    private final k79 A;
    private l6<sx6.a> A5;
    private final k79 B;
    private l6<ei7> B5;
    private final MoxyKtxDelegate C5;
    private final k79 I;
    private final k79 S4;
    private final k79 T4;
    private final k79 U4;
    private final k79 V4;
    private final k79 W4;
    private final k79 X;
    private final k79 X4;
    private final k79 Y;
    private final k79 Y4;
    private final k79 Z;
    private final k79 Z4;
    private final k79 a5;
    private final k79 b5;
    private final k79 c5;
    private final k79 d5;
    private final k79 e5;
    private final k79 f5;
    private final k79 g5;
    private final Logger h;
    private final k79 h5;
    private final k79 i;
    private final k79 i5;
    private final k79 j;
    private final k79 j5;
    private final k79 k;
    private final k79 k5;
    private final k79 l;
    private final k79 l5;
    private final k79 m;
    private final k79 m5;
    private final k79 n;
    private final k79 n5;
    private final k79 o;
    private final k79 o5;
    private final k79 p;
    private final k79 p5;
    private final k79 q;
    private final k79 q5;
    private final k79 r;
    private final k79 r5;
    private final k79 s;
    public pv9 s5;
    private final k79 t;
    public tg4 t5;
    private final k79 u;
    public vs2 u5;
    private final k79 v;
    public pu2 v5;
    private final k79 w;
    public yt9 w5;
    private final k79 x;
    public je4 x5;
    private final k79 y;
    public as8<CheckoutDetailsPresenter> y5;
    private final k79 z;
    public ay1 z5;
    static final /* synthetic */ je5<Object>[] E5 = {bc9.f(new ar8(c.class, "deferredTimeContainer", "getDeferredTimeContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "deferredTimeRecycler", "getDeferredTimeRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(c.class, "deferredTimeError", "getDeferredTimeError()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "checkoutDetailsContainer", "getCheckoutDetailsContainer()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(c.class, "summaryContainer", "getSummaryContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "orderTypeView", "getOrderTypeView()Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeView;", 0)), bc9.f(new ar8(c.class, "paymentMethodView", "getPaymentMethodView()Lru/dodopizza/app/presentation/checkout/details/views/PaymentMethodView;", 0)), bc9.f(new ar8(c.class, "buttonsContainer", "getButtonsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(c.class, "payWithGooglePayButton", "getPayWithGooglePayButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "payWithGooglePayButtonContainer", "getPayWithGooglePayButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "payWithSberPayButton", "getPayWithSberPayButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "payWithKaspiPayButton", "getPayWithKaspiPayButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "payWithSbpPayButton", "getPayWithSbpPayButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "placeOrderButton", "getPlaceOrderButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(c.class, "disablePlaceOrderButton", "getDisablePlaceOrderButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "addNotesButton", "getAddNotesButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "selectPizzeriaButton", "getSelectPizzeriaButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "addDeliveryLocationButton", "getAddDeliveryLocationButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "continueToDeliveryLocationDetailsButton", "getContinueToDeliveryLocationDetailsButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "selectDeferredTimeButton", "getSelectDeferredTimeButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "selectPaymentButton", "getSelectPaymentButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "minDeliveryPriceButton", "getMinDeliveryPriceButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "minDeliveryPriceContainer", "getMinDeliveryPriceContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "minDeliveryPriceGoodsLabel", "getMinDeliveryPriceGoodsLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "titleGoodsAmount", "getTitleGoodsAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "goodsTotalAmount", "getGoodsTotalAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "snackbarAnchor", "getSnackbarAnchor()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "discountContainer", "getDiscountContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "discountAmount", "getDiscountAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "orderTotalAmount", "getOrderTotalAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "moneyDetailsContainer", "getMoneyDetailsContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "orderTypeTitle", "getOrderTypeTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(c.class, "packagingView", "getPackagingView()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "deliveryFeeContainer", "getDeliveryFeeContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "deliveryFeeAmount", "getDeliveryFeeAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "orderReceivingList", "getOrderReceivingList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(c.class, "reusablePackageContainer", "getReusablePackageContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "reusablePackageTitle", "getReusablePackageTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "reusablePackageInfoCard", "getReusablePackageInfoCard()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "reusablePackageInfoAction", "getReusablePackageInfoAction()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "reusablePackageInfoDescription", "getReusablePackageInfoDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "reusablePackageSwitcher", "getReusablePackageSwitcher()Landroidx/appcompat/widget/SwitchCompat;", 0)), bc9.f(new ar8(c.class, "paymentMethodsWarningContainer", "getPaymentMethodsWarningContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "paymentMethodsWarningText", "getPaymentMethodsWarningText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "vpnWarningContainer", "getVpnWarningContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "paymentProgressIndicator", "getPaymentProgressIndicator()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "overloadModeContainer", "getOverloadModeContainer()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(c.class, "overloadModeTitle", "getOverloadModeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "overloadModeText", "getOverloadModeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "overloadModeButton", "getOverloadModeButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", 0))};
    public static final a D5 = new a(null);

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/c$a;", "", "Lb61;", "checkoutState", "Lru/dodopizza/app/presentation/checkout/details/c;", "a", "", "ANIMATION_DURATION", "J", "", "DEFERRED_TIME_HORIZONTAL_MARGIN", "I", "", "EXTRA_CHECKOUT_STATE", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(b61 b61Var) {
            z65.h(b61Var, "checkoutState");
            return (c) y64.d(new c(), bi0.c(bi0.d("extra_checkout_state", b61Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a0 extends ej5 implements Function1<View, Unit> {
        a0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.l.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pf0.values().length];
            try {
                iArr[pf0.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b0 extends ej5 implements Function1<View, Unit> {
        b0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.n.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.details.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0530c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ wo7.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0530c(wo7.b bVar) {
            super(1);
            this.b = bVar;
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(new b.k0(((wo7.b.a) this.b).d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c0 extends ej5 implements Function1<View, Unit> {
        c0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.y0.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "title", "", "position", "", "a", "(Ljava/lang/String;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function2<String, Integer, Unit> {
        d() {
            super(2);
        }

        public final void a(String str, int i) {
            z65.h(str, "title");
            c.this.oi().w(new b.a0(null, str, true, i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d0 extends ej5 implements Function1<View, Unit> {
        d0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.x0.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", CrashHianalyticsData.TIME, "", "title", "", "isSuggested", "", "position", "", "a", "(JLjava/lang/String;ZI)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements a94<Long, String, Boolean, Integer, Unit> {
        e() {
            super(4);
        }

        public final void a(long j, String str, boolean z, int i) {
            z65.h(str, "title");
            c.this.oi().w(new b.a0(Long.valueOf(j), str, z, i));
        }

        @Override // defpackage.a94
        public /* bridge */ /* synthetic */ Unit q(Long l, String str, Boolean bool, Integer num) {
            a(l.longValue(), str, bool.booleanValue(), num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e0 extends ej5 implements Function1<View, Unit> {
        e0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.h0.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<Integer, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            c.this.oi().w(new b.d(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f0 extends ej5 implements Function1<Boolean, Unit> {
        f0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.a;
        }

        public final void invoke(boolean z) {
            c.this.oi().w(new b.f0(z));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<Object, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof sx6.a.c);
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class g0 extends ej5 implements Function0<Unit> {
        g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.oi().w(new b.e0(false));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final h a = new h();

        public h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = DeferredTimeViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class h0 extends ej5 implements Function0<Unit> {
        h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.oi().w(new b.e0(true));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<Object, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof sx6.a.d);
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class i0 extends ej5 implements Function0<Unit> {
        i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.oi().w(new b.b1(false));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final j a = new j();

        public j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = DeferredTimeViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j0 extends ej5 implements Function1<Object, Boolean> {
        public static final j0 a = new j0();

        public j0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ei7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<Object, Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof sx6.a.C0671a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final k0 a = new k0();

        public k0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = OrderReceivingTypeHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final l a = new l();

        public l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = DeferredTimeViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class l0 extends ej5 implements Function0<CheckoutDetailsPresenter> {
        l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CheckoutDetailsPresenter invoke() {
            return c.this.pi().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class m extends ej5 implements Function1<View, Unit> {
        m() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.n.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class m0 extends ej5 implements Function1<View, Unit> {
        public static final m0 a = new m0();

        m0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class n extends ej5 implements Function0<Unit> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.oi().w(b.c1.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lsx6$a;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class n0 extends ej5 implements Function2<List<? extends sx6.a>, List<? extends sx6.a>, e.C0047e> {
        public static final n0 a = new n0();

        n0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<? extends sx6.a> list, List<? extends sx6.a> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new us2(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class o extends ej5 implements Function0<Unit> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.oi().w(b.d1.a);
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class o0 extends ej5 implements Function1<View, Unit> {
        o0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.n.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p extends ej5 implements Function1<View, Unit> {
        p() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"ru/dodopizza/app/presentation/checkout/details/c$p0", "Lz6a$b;", "", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p0 implements z6a.b {
        p0() {
        }

        @Override // defpackage.z6a.b
        public void a() {
            c.this.oi().w(b.d0.a);
        }

        @Override // defpackage.z6a.b
        public void b() {
            c.this.oi().w(new b.b1(true));
        }

        @Override // defpackage.z6a.b
        public void c() {
            c.this.oi().w(b.c0.a);
        }

        @Override // defpackage.z6a.b
        public void d() {
            c.this.oi().w(b.b0.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function1<View, Unit> {
        q() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsFragment$updateLastLocation$1", f = "CheckoutDetailsFragment.kt", l = {795}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class q0 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsFragment$updateLastLocation$1$1", f = "CheckoutDetailsFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ c c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, cv1<? super a> cv1Var) {
                super(3, cv1Var);
                this.c = cVar;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = th;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.h.warn("Failed to update location on checkout. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "it", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b<T> implements pz3 {
            public static final b<T> a = new b<>();

            b() {
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                return Unit.a;
            }
        }

        q0(cv1<? super q0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new q0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((q0) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3 h = wz3.h(qv5.b.a(qv5.a.a(c.this.Oh()), null, 1, null), new a(c.this, null));
                pz3 pz3Var = b.a;
                this.a = 1;
                if (h.collect(pz3Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r extends ej5 implements Function1<View, Unit> {
        r() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class s extends ej5 implements Function1<View, Unit> {
        s() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class t extends ej5 implements Function1<View, Unit> {
        t() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class u extends ej5 implements Function1<View, Unit> {
        u() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.C0529b.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class v extends ej5 implements Function1<View, Unit> {
        v() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.x.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class w extends ej5 implements Function1<View, Unit> {
        w() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.c.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class x extends ej5 implements Function1<View, Unit> {
        x() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.n.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class y extends ej5 implements Function1<View, Unit> {
        y() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.y0.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class z extends ej5 implements Function1<View, Unit> {
        z() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.oi().w(b.a.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public c() {
        super(R.layout.fragment_checkout_details);
        List l2;
        this.h = LoggerFactory.getLogger("CheckoutDetailsFragment");
        this.i = kb0.e(this, R.id.deferred_time_container);
        this.j = kb0.e(this, R.id.deferred_time_list);
        this.k = kb0.e(this, R.id.deferred_time_error);
        this.l = kb0.e(this, R.id.groupCheckoutSettings);
        this.m = kb0.e(this, R.id.groupSummary);
        this.n = kb0.e(this, R.id.order_type_view);
        this.o = kb0.e(this, R.id.payment_method_view);
        this.p = kb0.e(this, R.id.buttons_container);
        this.q = kb0.e(this, R.id.pay_with_google_pay_button);
        this.r = kb0.e(this, R.id.pay_with_google_pay_button_container);
        this.s = kb0.e(this, R.id.pay_with_sber_pay_button);
        this.t = kb0.e(this, R.id.pay_with_kaspi_pay_button);
        this.u = kb0.e(this, R.id.pay_with_sbp_pay_button);
        this.v = kb0.e(this, R.id.place_order_button);
        this.w = kb0.e(this, R.id.disabled_place_order_button);
        this.x = kb0.e(this, R.id.add_notes_button);
        this.y = kb0.e(this, R.id.select_pizzeria_button);
        this.z = kb0.e(this, R.id.add_delivery_location_button);
        this.A = kb0.e(this, R.id.continue_to_delivery_location_details_button);
        this.B = kb0.e(this, R.id.select_deferred_time_button);
        this.I = kb0.e(this, R.id.select_payment_method);
        this.X = kb0.e(this, R.id.min_delivery_price_button);
        this.Y = kb0.e(this, R.id.min_delivery_price_container);
        this.Z = kb0.e(this, R.id.min_delivery_price_goods_label);
        this.S4 = kb0.e(this, R.id.title_goods_amount);
        this.T4 = kb0.e(this, R.id.goods_raw_sum);
        this.U4 = kb0.e(this, R.id.snackbar_anchor);
        this.V4 = kb0.e(this, R.id.discount_container);
        this.W4 = kb0.e(this, R.id.discount_amount);
        this.X4 = kb0.e(this, R.id.order_total_amount);
        this.Y4 = kb0.e(this, R.id.summary_money_details_container);
        this.Z4 = kb0.e(this, R.id.order_type_title);
        this.a5 = kb0.e(this, R.id.packaging_view);
        this.b5 = kb0.e(this, R.id.delivery_fee_container);
        this.c5 = kb0.e(this, R.id.delivery_fee_amount);
        this.d5 = kb0.e(this, R.id.order_receiving_list);
        this.e5 = kb0.e(this, R.id.reusable_package_container);
        this.f5 = kb0.e(this, R.id.reusable_package_title);
        this.g5 = kb0.e(this, R.id.reusable_package_info_card);
        this.h5 = kb0.e(this, R.id.reusable_package_info_action);
        this.i5 = kb0.e(this, R.id.reusable_package_info_description);
        this.j5 = kb0.e(this, R.id.reusable_package_switcher);
        this.k5 = kb0.e(this, R.id.payment_methods_warning_container);
        this.l5 = kb0.e(this, R.id.payment_method_warning_text);
        this.m5 = kb0.e(this, R.id.vpn_warning_container);
        this.n5 = kb0.e(this, R.id.payment_progress_indicator);
        this.o5 = kb0.e(this, R.id.overload_mode_container);
        this.p5 = kb0.e(this, R.id.overload_mode_title);
        this.q5 = kb0.e(this, R.id.overload_mode_warning);
        this.r5 = kb0.e(this, R.id.overload_mode_button);
        l2 = kc1.l();
        this.A5 = new l6<>(l2);
        this.B5 = new l6<>(null, 1, null);
        l0 l0Var = new l0();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.C5 = new MoxyKtxDelegate(mvpDelegate, CheckoutDetailsPresenter.class.getName() + ".presenter", l0Var);
    }

    private final View Ah() {
        return (View) this.x.a(this, E5[15]);
    }

    private final View Ai() {
        return (View) this.y.a(this, E5[16]);
    }

    private final ViewGroup Bh() {
        return (ViewGroup) this.p.a(this, E5[7]);
    }

    private final View Bi() {
        return (View) this.U4.a(this, E5[26]);
    }

    private final NestedScrollView Ch() {
        return (NestedScrollView) this.l.a(this, E5[3]);
    }

    private final View Ci() {
        return (View) this.m.a(this, E5[4]);
    }

    private final View Dh() {
        return (View) this.A.a(this, E5[18]);
    }

    private final TextView Ei() {
        return (TextView) this.S4.a(this, E5[24]);
    }

    private final View Fh() {
        return (View) this.i.a(this, E5[0]);
    }

    private final String Fi(boolean z2) {
        String string;
        if (z2) {
            string = requireContext().getString(R.string.unknown_error_feedback_email, Eh().e().a());
        } else {
            string = getString(R.string.unknown_error);
        }
        z65.e(string);
        return string;
    }

    private final TextView Gh() {
        return (TextView) this.k.a(this, E5[2]);
    }

    private final View Gi() {
        return (View) this.m5.a(this, E5[44]);
    }

    private final RecyclerView Hh() {
        return (RecyclerView) this.j.a(this, E5[1]);
    }

    private final void Hi() {
        androidx.recyclerview.widget.q qVar;
        RecyclerView Hh = Hh();
        k6 k6Var = new k6(this.A5);
        new k6.a(k6Var, g.a, new fp3(new d()), h.a).b();
        new k6.a(k6Var, i.a, new hgb(new e()), j.a).b();
        new k6.a(k6Var, k.a, new ul(new f()), l.a).b();
        Hh.setAdapter(k6Var.d());
        Hh().addItemDecoration(new zo4(8, 0, 0));
        RecyclerView.m itemAnimator = Hh().getItemAnimator();
        if (itemAnimator instanceof androidx.recyclerview.widget.q) {
            qVar = (androidx.recyclerview.widget.q) itemAnimator;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            qVar.S(false);
        }
    }

    private final void Ii() {
        oma.a(Yh().getAddressView(), new w());
        oma.a(Yh().getPizzeriaView(), new y());
        oma.a(zh(), new z());
        oma.a(Dh(), new a0());
        oma.a(yi(), new b0());
        oma.a(Ai(), new c0());
        oma.a(zi(), new d0());
        oma.a(ji(), new e0());
        ji().setOnSaveRecurrentSwitcherCheckedChangeListener(new f0());
        oma.a(Yh().getDeferredTimeView(), new m());
        Yh().getOrderTypeSwitcher().setOnDeliverySelectedListener(new n());
        Yh().getOrderTypeSwitcher().setOnRestaurantSelectedListener(new o());
        oma.a(ei(), new p());
        oma.a(hi(), new q());
        oma.a(gi(), new r());
        oma.a(ii(), new s());
        oma.a(ni(), new t());
        oma.a(Ah(), new u());
        oma.a(Rh(), new v());
        ui().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: g41
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                c.Ji(c.this, compoundButton, z2);
            }
        });
        oma.a(Zh(), new x());
    }

    private final TextView Jh() {
        return (TextView) this.c5.a(this, E5[34]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ji(c cVar, CompoundButton compoundButton, boolean z2) {
        z65.h(cVar, "this$0");
        cVar.oi().w(new b.l0(z2));
    }

    private final View Kh() {
        return (View) this.b5.a(this, E5[33]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ki(c cVar) {
        z65.h(cVar, "this$0");
        if (cVar.Ch().getPaddingBottom() != cVar.Ci().getHeight()) {
            NestedScrollView Ch = cVar.Ch();
            Ch.setPadding(Ch.getPaddingLeft(), Ch.getPaddingTop(), Ch.getPaddingRight(), cVar.Ci().getHeight());
        }
    }

    private final View Lh() {
        return (View) this.w.a(this, E5[14]);
    }

    private final void Li(sx6 sx6Var) {
        if (sx6Var instanceof sx6.c) {
            un3.k(Fh());
        } else if (sx6Var instanceof sx6.b.C0672b) {
            Mi(((sx6.b.C0672b) sx6Var).a());
            un3.e(Gh());
        } else if (sx6Var instanceof sx6.b.a) {
            sx6.b.a aVar = (sx6.b.a) sx6Var;
            Mi(aVar.a());
            d41 b2 = aVar.b();
            if (b2 instanceof d41.h) {
                un3.k(Gh());
                Gh().setText(((d41.h) b2).b());
            } else if (b2 instanceof d41.k) {
                un3.k(Gh());
                Gh().setText(((d41.k) b2).b());
            } else {
                un3.e(Gh());
            }
        }
    }

    private final TextView Mh() {
        return (TextView) this.W4.a(this, E5[28]);
    }

    private final void Mi(List<? extends sx6.a> list) {
        this.A5.Z(list, n0.a);
        RecyclerView.h adapter = Hh().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        un3.k(Fh());
        un3.k(Hh());
    }

    private final View Nh() {
        return (View) this.V4.a(this, E5[27]);
    }

    private final void Ni(wk7 wk7Var) {
        String string;
        AppCompatTextView Xh = Xh();
        if (wk7Var.b()) {
            string = getString(R.string.delivery_order_type_label);
        } else if (wk7Var.d()) {
            string = getString(R.string.pizzeria_order_type_label);
        } else {
            string = getString(R.string.carryout_order_type_label);
        }
        Xh.setText(string);
    }

    private final void Oi(b61 b61Var) {
        if (b61Var.k().d()) {
            Pi(b61Var);
        } else {
            un3.e(di());
        }
    }

    private final TextView Ph() {
        return (TextView) this.T4.a(this, E5[25]);
    }

    private final void Pi(b61 b61Var) {
        int w2;
        un3.k(di());
        Vh().setEnabled(!(b61Var.m() instanceof zo7.b));
        List<ok9> o2 = b61Var.o();
        w2 = lc1.w(o2, 10);
        ArrayList arrayList = new ArrayList(w2);
        for (ok9 ok9Var : o2) {
            arrayList.add(wh(ok9Var, b61Var.m()));
        }
        this.B5.T(arrayList);
    }

    private final void Qi(u31 u31Var) {
        if (u31Var instanceof u31.h) {
            Wi(this, false, 1, null);
        } else if (u31Var instanceof u31.e) {
            n1c.e(Bh(), Lh());
        } else if (u31Var instanceof u31.a) {
            n1c.e(Bh(), Ah());
        } else if (u31Var instanceof u31.f) {
            n1c.e(Bh(), fi());
        } else if (u31Var instanceof u31.j) {
            n1c.e(Bh(), hi());
        } else if (u31Var instanceof u31.k) {
            n1c.e(Bh(), ii());
        } else if (u31Var instanceof u31.c) {
            if (b.$EnumSwitchMapping$0[((u31.c) u31Var).a().ordinal()] == 1) {
                n1c.e(Bh(), gi());
            } else {
                Wi(this, false, 1, null);
            }
        } else if (u31Var instanceof u31.g) {
            u31.g gVar = (u31.g) u31Var;
            Si(gVar.b(), gVar.a(), gVar.c());
        } else if (u31Var instanceof u31.b) {
            n1c.e(Bh(), zh());
        } else if (u31Var instanceof u31.d) {
            n1c.e(Bh(), Dh());
        } else if (u31Var instanceof u31.n) {
            n1c.e(Bh(), Ai());
        } else if (u31Var instanceof u31.m) {
            n1c.e(Bh(), zi());
        } else if (u31Var instanceof u31.i) {
            Vi(true);
        } else if (u31Var instanceof u31.l) {
            n1c.e(Bh(), yi());
        }
    }

    private final void R9(String str) {
        if (getView() != null) {
            Snackbar i02 = Snackbar.i0(Bi(), str, 0);
            z65.e(i02);
            coa.d(i02);
            i02.U();
        }
    }

    private final TextView Rh() {
        return (TextView) this.X.a(this, E5[21]);
    }

    private final void Ri(d41 d41Var, boolean z2) {
        if (d41Var instanceof d41.r) {
            R9(((d41.r) d41Var).b());
        } else {
            R9(Fi(z2));
        }
    }

    private final View Sh() {
        return (View) this.Y.a(this, E5[22]);
    }

    private final void Si(hn6 hn6Var, boolean z2, boolean z3) {
        int i2;
        n1c.e(Bh(), Sh());
        Rh().setText(requireContext().getString(R.string.min_delivery_price_button_title, un6.b(hn6Var)));
        if (z3) {
            un3.e(Th());
            return;
        }
        if (z2) {
            i2 = R.color.textIconWarningColor;
        } else {
            i2 = R.color.textIconSecondaryColor;
        }
        Th().setTextColor(iu1.c(requireContext(), i2));
        un3.k(Th());
    }

    private final TextView Th() {
        return (TextView) this.Z.a(this, E5[23]);
    }

    private final void Ti(in6 in6Var) {
        String quantityString = getResources().getQuantityString(R.plurals.good_plural, in6Var.e(), Integer.valueOf(in6Var.e()));
        z65.g(quantityString, "getQuantityString(...)");
        Ei().setText(quantityString);
        Ph().setText(un6.b(in6Var.i()));
        un3.o(Nh(), !in6Var.d().d());
        Mh().setText(getString(R.string.discount_label, un6.b(in6Var.d())));
        fx2 c = in6Var.c();
        if (c instanceof fx2.d) {
            un3.k(Kh());
            Jh().setText(un6.b(((fx2.d) c).a()));
        } else if (c instanceof fx2.a) {
            un3.k(Kh());
        } else if (c instanceof fx2.c) {
            un3.e(Kh());
        } else if (c instanceof fx2.b) {
            un3.k(Kh());
            Jh().setText(getString(R.string.free_delivery_fee_promo));
        }
        un3.o(Uh(), in6Var.j());
        Wh().setText(un6.b(in6Var.k()));
    }

    private final View Uh() {
        return (View) this.Y4.a(this, E5[30]);
    }

    private final void Ui(String str) {
        if (str == null) {
            un3.e(ki());
            return;
        }
        li().setText(str);
        un3.k(ki());
    }

    private final RecyclerView Vh() {
        return (RecyclerView) this.d5.a(this, E5[35]);
    }

    private final void Vi(boolean z2) {
        n1c.e(Bh(), ni());
        if (z2) {
            ni().setState(DodoButton.a.b);
        } else {
            ni().setState(DodoButton.a.a);
        }
    }

    private final TextView Wh() {
        return (TextView) this.X4.a(this, E5[29]);
    }

    static /* synthetic */ void Wi(c cVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        cVar.Vi(z2);
    }

    private final AppCompatTextView Xh() {
        return (AppCompatTextView) this.Z4.a(this, E5[31]);
    }

    private final OrderTypeView Yh() {
        return (OrderTypeView) this.n.a(this, E5[5]);
    }

    private final TextView Zh() {
        return (TextView) this.r5.a(this, E5[49]);
    }

    private final MaterialCardView ai() {
        return (MaterialCardView) this.o5.a(this, E5[46]);
    }

    private final TextView bi() {
        return (TextView) this.q5.a(this, E5[48]);
    }

    private final TextView ci() {
        return (TextView) this.p5.a(this, E5[47]);
    }

    private final View di() {
        return (View) this.a5.a(this, E5[32]);
    }

    private final View ei() {
        return (View) this.q.a(this, E5[8]);
    }

    private final View fi() {
        return (View) this.r.a(this, E5[9]);
    }

    private final View gi() {
        return (View) this.t.a(this, E5[11]);
    }

    private final View hi() {
        return (View) this.s.a(this, E5[10]);
    }

    private final View ii() {
        return (View) this.u.a(this, E5[12]);
    }

    private final PaymentMethodView ji() {
        return (PaymentMethodView) this.o.a(this, E5[6]);
    }

    private final View ki() {
        return (View) this.k5.a(this, E5[42]);
    }

    private final TextView li() {
        return (TextView) this.l5.a(this, E5[43]);
    }

    private final View mi() {
        return (View) this.n5.a(this, E5[45]);
    }

    private final DodoButton ni() {
        return (DodoButton) this.v.a(this, E5[13]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckoutDetailsPresenter oi() {
        return (CheckoutDetailsPresenter) this.C5.getValue(this, E5[50]);
    }

    private final View qi() {
        return (View) this.e5.a(this, E5[36]);
    }

    private final TextView ri() {
        return (TextView) this.h5.a(this, E5[39]);
    }

    private final View si() {
        return (View) this.g5.a(this, E5[38]);
    }

    private final TextView ti() {
        return (TextView) this.i5.a(this, E5[40]);
    }

    private final SwitchCompat ui() {
        return (SwitchCompat) this.j5.a(this, E5[41]);
    }

    private final TextView vi() {
        return (TextView) this.f5.a(this, E5[37]);
    }

    private final ei7 wh(ok9 ok9Var, zo7 zo7Var) {
        Boolean R;
        Boolean R2;
        boolean z2 = true;
        boolean z3 = !(zo7Var instanceof zo7.c);
        if (ok9Var instanceof ok9.b) {
            return new ei7.b((!z3 || (R2 = zo7Var.R()) == null || R2.booleanValue()) ? false : false);
        } else if (ok9Var instanceof ok9.c) {
            return new ei7.c((z3 && (R = zo7Var.R()) != null && R.booleanValue()) ? false : false);
        } else if (ok9Var instanceof ok9.a) {
            Integer g02 = zo7Var.g0();
            if (z3 && g02 != null) {
                return new ei7.a.b(g02.intValue());
            }
            return ei7.a.C0304a.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void xh(wo7 wo7Var) {
        if (wo7Var instanceof wo7.b) {
            yh((wo7.b) wo7Var);
        } else {
            un3.e(qi());
        }
    }

    private final void yh(wo7.b bVar) {
        un3.k(qi());
        ui().setChecked(bVar.g());
        if (bVar instanceof wo7.b.a) {
            wo7.b.a aVar = (wo7.b.a) bVar;
            vi().setText(aVar.i());
            ti().setText(aVar.e());
            ri().setText(aVar.c());
            un3.k(ri());
            ui().setText(aVar.f());
            oma.a(si(), new C0530c(bVar));
            return;
        }
        vi().setText(R.string.reusable_package_title);
        ti().setText(R.string.reusable_package_description);
        un3.e(ri());
        ui().setText(R.string.reusable_package_switcher_title);
        si().setOnClickListener(null);
        si().setClickable(false);
    }

    private final View yi() {
        return (View) this.B.a(this, E5[19]);
    }

    private final View zh() {
        return (View) this.z.a(this, E5[17]);
    }

    private final View zi() {
        return (View) this.I.a(this, E5[20]);
    }

    @Override // defpackage.w41
    public void C8() {
        un3.k(ai());
    }

    @Override // defpackage.w41
    public void Df() {
        un3.k(Zh());
    }

    public final vs2 Di() {
        vs2 vs2Var = this.u5;
        if (vs2Var != null) {
            return vs2Var;
        }
        z65.z("timeFormatter");
        return null;
    }

    @Override // defpackage.w41
    public void E6(List<? extends ok9> list) {
        z65.h(list, "serviceTypes");
        z6a a2 = z6a.e.a(list);
        a2.jh(new p0());
        a2.show(getParentFragmentManager(), (String) null);
    }

    public final ay1 Eh() {
        ay1 ay1Var = this.z5;
        if (ay1Var != null) {
            return ay1Var;
        }
        z65.z("currentCountry");
        return null;
    }

    @Override // defpackage.w41
    public void I1() {
        bi().setText(getString(R.string.checkout_overload_mode_many_orders));
    }

    public final pu2 Ih() {
        pu2 pu2Var = this.v5;
        if (pu2Var != null) {
            return pu2Var;
        }
        z65.z("deliverablePlaceFormatter");
        return null;
    }

    @Override // defpackage.w41
    public void L8() {
        String string = getString(R.string.default_payment_error_desc);
        z65.g(string, "getString(...)");
        R9(string);
    }

    @Override // defpackage.w41
    public void Mb() {
        un3.e(Zh());
    }

    @Override // defpackage.w41
    public void O2() {
        oma.a(ai(), new o0());
        ai().setClickable(true);
    }

    public final je4 Oh() {
        je4 je4Var = this.x5;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // defpackage.w41
    public void P0(String str) {
        z65.h(str, "discount");
        Yh().n(str);
    }

    @Override // defpackage.w41
    public void P9() {
        bi().setText(getString(R.string.checkout_overload_mode_later));
    }

    @Override // defpackage.w41
    public void Q5(String str) {
        Object b2;
        z65.h(str, RemoteMessageConst.Notification.URL);
        try {
            sk9.a aVar = sk9.b;
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            b2 = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b2 = sk9.b(vk9.a(th));
        }
        Throwable d2 = sk9.d(b2);
        if (d2 != null) {
            oi().w(new b.e(str, d2));
        }
        if (sk9.i(b2)) {
            Unit unit = (Unit) b2;
            oi().w(b.f.a);
        }
    }

    public final tg4 Qh() {
        tg4 tg4Var = this.t5;
        if (tg4Var != null) {
            return tg4Var;
        }
        z65.z("googlePayController");
        return null;
    }

    @Override // defpackage.w41
    public void Rb(String str) {
        Object b2;
        z65.h(str, "deepLink");
        Intent a2 = wi().a(str);
        try {
            sk9.a aVar = sk9.b;
            startActivity(a2);
            b2 = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b2 = sk9.b(vk9.a(th));
        }
        Throwable d2 = sk9.d(b2);
        if (d2 != null) {
            oi().w(new b.m0(str, d2));
        }
        if (sk9.i(b2)) {
            Unit unit = (Unit) b2;
            oi().w(b.n0.a);
        }
    }

    @Override // defpackage.w41
    public void T6() {
        oma.a(ai(), m0.a);
        ai().setClickable(false);
    }

    @Override // defpackage.w41
    public void Tc() {
        Yh().l();
    }

    @Override // defpackage.w41
    public void V3(b61 b61Var) {
        z65.h(b61Var, "model");
        un3.o(mi(), true);
    }

    @Override // defpackage.w41
    public void V8(ik3 ik3Var) {
        z65.h(ik3Var, "errorMessage");
        R9(ik3Var.a());
    }

    @Override // defpackage.w41
    public void W() {
        Yh().f();
    }

    @Override // defpackage.w41
    public void Wd() {
        sh0.d(pp5.a(this), null, null, new q0(null), 3, null);
    }

    @Override // defpackage.w41
    public void Y3(String str, PaymentDataRequest paymentDataRequest, z41 z41Var, String str2) {
        z65.h(str, "paymentId");
        z65.h(paymentDataRequest, "paymentDataRequest");
        z65.h(z41Var, "googlePayListener");
        z65.h(str2, "env");
        Qh().b(z41Var);
        tg4 Qh = Qh();
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity(...)");
        Qh.d(requireActivity, str, paymentDataRequest, str2);
    }

    @Override // defpackage.w41
    public void Zf() {
        un3.e(ai());
    }

    @Override // defpackage.w41
    public void a7() {
        Yh().e();
    }

    @Override // defpackage.w41
    public void f6(int i2) {
        Hh().scrollToPosition(i2);
    }

    @Override // defpackage.w41
    public void jf() {
        un3.e(ci());
    }

    @Override // defpackage.w41
    public void k2() {
        un3.k(ci());
    }

    @Override // defpackage.w41
    public void lc(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.g(requireContext, str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        c41.a B2 = ((CheckoutComponent) getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).B2();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_checkout_state")) == null) ? null : null;
        if (obj != null && !(obj instanceof b61)) {
            throw new ClassCastException("Property extra_checkout_state has different class type");
        } else if (obj != null) {
            B2.c((b61) obj).b(this).a().a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_checkout_state not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        oi().w(b.g.a);
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ii();
        Hi();
        Vh().addItemDecoration(new cj8());
        Vh().addItemDecoration(new zo4(11, 0, 0));
        RecyclerView Vh = Vh();
        k6 k6Var = new k6(this.B5);
        new k6.a(k6Var, j0.a, new di7(new g0(), new h0(), new i0()), k0.a).b();
        Vh.setAdapter(k6Var.d());
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: f41
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                c.Ki(c.this);
            }
        });
    }

    public final as8<CheckoutDetailsPresenter> pi() {
        as8<CheckoutDetailsPresenter> as8Var = this.y5;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.w41
    public void v5(b61 b61Var) {
        du7 du7Var;
        z65.h(b61Var, "model");
        Yh().k(b61Var.k(), b61Var.e(), b61Var.f(), Di(), Ih(), xi());
        Li(b61Var.j());
        ji().i(b61Var.n(), b61Var.k());
        Oi(b61Var);
        Ni(b61Var.k());
        Ti(b61Var.i());
        Ui(b61Var.f().d());
        un3.o(Gi(), b61Var.f().k());
        xh(b61Var.l());
        Qi(b61Var.c());
        setCancelable(!(b61Var.c() instanceof u31.i));
        jw7 a2 = b61Var.n().a();
        if (a2 != null) {
            du7Var = a2.c();
        } else {
            du7Var = null;
        }
        if (du7Var != mh5.c(du7.o, Boolean.TRUE)) {
            un3.o(mi(), b61Var.c() instanceof u31.i.a);
        }
        for (d41 d41Var : b61Var.q()) {
            Ri(d41Var, b61Var.f().e());
        }
        y31 oh = oh();
        if (oh != null) {
            oh.uh(b61Var);
        }
    }

    @Override // defpackage.bl2
    public void ve(Object obj) {
        z65.h(obj, "data");
        if (obj instanceof hw7) {
            oi().w(b.i0.a);
        }
    }

    public final yt9 wi() {
        yt9 yt9Var = this.w5;
        if (yt9Var != null) {
            return yt9Var;
        }
        z65.z("sberPayIntentBuilder");
        return null;
    }

    @Override // defpackage.w41
    public void x1(String str, hu9 hu9Var) {
        Object b2;
        String F;
        z65.h(str, RemoteMessageConst.Notification.URL);
        z65.h(hu9Var, "sbpBank");
        try {
            sk9.a aVar = sk9.b;
            F = l0b.F(str, "https", hu9Var.a(), false, 4, null);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(F)));
            b2 = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b2 = sk9.b(vk9.a(th));
        }
        Throwable d2 = sk9.d(b2);
        if (d2 != null) {
            if (d2 instanceof ActivityNotFoundException) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                oi().w(b.p0.a);
            } else {
                oi().w(new b.o0(str, d2));
            }
            oi().U1();
        }
        if (sk9.i(b2)) {
            Unit unit = (Unit) b2;
            oi().w(b.p0.a);
            oi().V1();
        }
    }

    public final pv9 xi() {
        pv9 pv9Var = this.s5;
        if (pv9Var != null) {
            return pv9Var;
        }
        z65.z("scheduleHelper");
        return null;
    }
}
