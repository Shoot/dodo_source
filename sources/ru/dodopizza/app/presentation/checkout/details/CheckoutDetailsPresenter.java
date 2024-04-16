package ru.dodopizza.app.presentation.checkout.details;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.e22;
import defpackage.ii7;
import defpackage.iq1;
import defpackage.jw7;
import defpackage.ko3;
import defpackage.l6b;
import defpackage.lk7;
import defpackage.nk9;
import defpackage.pt2;
import defpackage.sx6;
import defpackage.t51;
import defpackage.tmb;
import defpackage.ts7;
import defpackage.u31;
import defpackage.u51;
import defpackage.v51;
import defpackage.xtb;
import defpackage.zo7;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.details.a;
import ru.dodopizza.app.presentation.checkout.details.b;
import ru.dodopizza.app.presentation.checkout.details.d;
/* compiled from: CheckoutDetailsPresenter.kt */
@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 Û\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002Ü\u0001B\u0084\u0001\b\u0007\u0012\u0007\u0010¤\u0001\u001a\u00020\u0005\u0012\b\u0010¨\u0001\u001a\u00030¥\u0001\u0012\b\u0010¬\u0001\u001a\u00030©\u0001\u0012\n\b\u0001\u0010°\u0001\u001a\u00030\u00ad\u0001\u0012\b\u0010²\u0001\u001a\u00030\u00ad\u0001\u0012\b\u0010¶\u0001\u001a\u00030³\u0001\u0012\b\u0010º\u0001\u001a\u00030·\u0001\u0012\b\u0010¾\u0001\u001a\u00030»\u0001\u0012\b\u0010Â\u0001\u001a\u00030¿\u0001\u0012\b\u0010Æ\u0001\u001a\u00030Ã\u0001\u0012\b\u0010Ê\u0001\u001a\u00030Ç\u0001\u0012\b\u0010Î\u0001\u001a\u00030Ë\u0001¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010\u0019\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\u001e\u0010\u001e\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J&\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0002J(\u0010)\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u0018\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\nH\u0002J\u0018\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020$H\u0002J \u00107\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0010\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0002J\u0018\u0010<\u001a\u00020\n2\u0006\u00109\u001a\u00020;2\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0018\u0010>\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010=\u001a\u00020'H\u0002J\u0010\u0010@\u001a\u00020?2\u0006\u00104\u001a\u000203H\u0002J\u0010\u0010A\u001a\u00020?2\u0006\u00104\u001a\u000203H\u0002J\u0018\u0010B\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\bD\u0010CJ\u0010\u0010E\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0002J0\u0010I\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010=\u001a\u00020'2\u0006\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$H\u0002J\u0010\u0010J\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0002J\u0010\u0010K\u001a\u00020?2\u0006\u00104\u001a\u000203H\u0002J\u0010\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020LH\u0002J\b\u0010O\u001a\u00020\nH\u0002J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005H\u0002J\b\u0010R\u001a\u00020\nH\u0002J\b\u0010S\u001a\u00020\nH\u0002J\b\u0010T\u001a\u00020\nH\u0002J\b\u0010U\u001a\u00020\nH\u0002J\b\u0010V\u001a\u00020\nH\u0002J\u0010\u0010W\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0010\u0010X\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0010\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020/H\u0002J\u0010\u0010]\u001a\u00020\n2\u0006\u0010\\\u001a\u00020[H\u0002J\u001a\u0010b\u001a\u00020\n2\u0006\u0010_\u001a\u00020^2\b\u0010a\u001a\u0004\u0018\u00010`H\u0002J\u0019\u0010e\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010cH\u0002¢\u0006\u0004\be\u0010fJ9\u0010j\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010g\u001a\u00020$2\u0006\u0010h\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010i\u001a\u00020[H\u0002¢\u0006\u0004\bj\u0010kJ\u0010\u0010m\u001a\u00020\n2\u0006\u0010l\u001a\u00020/H\u0002J\u0010\u0010n\u001a\u00020\n2\u0006\u0010l\u001a\u00020/H\u0002J9\u0010p\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010g\u001a\u00020$2\u0006\u0010h\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010o\u001a\u00020/H\u0002¢\u0006\u0004\bp\u0010qJ\u0018\u0010u\u001a\u00020\n2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020/H\u0002J \u0010w\u001a\u00020\n2\u0006\u0010v\u001a\u00020r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010t\u001a\u00020/H\u0002J\u0018\u0010z\u001a\u00020\n2\u0006\u0010x\u001a\u00020\u00052\u0006\u0010y\u001a\u00020/H\u0002J\b\u0010{\u001a\u00020\nH\u0002J\u0010\u0010|\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010}\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J#\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020~2\u0006\u0010y\u001a\u00020/2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002J\u001b\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010y\u001a\u00020/2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002J$\u0010\u0085\u0001\u001a\u00020\n2\b\u0010\u007f\u001a\u0004\u0018\u00010~2\u0006\u0010y\u001a\u00020/2\u0007\u0010\u0084\u0001\u001a\u00020/H\u0002J#\u0010\u0087\u0001\u001a\u00020\n2\u0007\u0010\u0086\u0001\u001a\u00020~2\u0006\u0010y\u001a\u00020/2\u0007\u0010\u0084\u0001\u001a\u00020/H\u0002J\u0011\u0010\u0088\u0001\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0011\u0010\u0089\u0001\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001b\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020~2\u0007\u0010\u008b\u0001\u001a\u00020~H\u0002J\u001b\u0010\u008f\u0001\u001a\u00020\n2\u0006\u0010a\u001a\u00020`2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002J/\u0010\u0091\u0001\u001a\u00020\n2\u0006\u0010a\u001a\u00020`2\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0017\u0010\u0093\u0001\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0018H\u0002J\u0011\u0010\u0094\u0001\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0005H\u0002J\t\u0010\u0095\u0001\u001a\u00020\nH\u0002J\t\u0010\u0096\u0001\u001a\u00020\nH\u0002J\t\u0010\u0097\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020/H\u0002J4\u0010\u009d\u0001\u001a-\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u009b\u0001\u0012\u0004\u0012\u00020\n0\u009a\u0001j\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u009c\u0001H\u0016J\u0007\u0010\u009e\u0001\u001a\u00020\nJ\u0007\u0010\u009f\u0001\u001a\u00020\nJ\u0015\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0018H\u0016J\t\u0010¡\u0001\u001a\u00020\nH\u0016R\u0017\u0010¤\u0001\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010²\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010¯\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R)\u0010Ó\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u009a\u00018\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\"\u0010Ø\u0001\u001a\r Õ\u0001*\u0005\u0018\u00010Ô\u00010Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001¨\u0006Ý\u0001"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lw41;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "Lb61;", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "R1", "Lv51;", "error", "", "d1", "e1", "w1", "v1", "f1", "data", "i1", "j1", "Lwk9;", "Lmt2;", "resultListener", "k1", "T1", "Lbua;", "Z0", "Lfn3;", "pizzeriaType", "x1", "l1", "H0", "Lru/dodopizza/app/presentation/checkout/details/b$v;", "event", "S0", "S1", "D1", "", "sbpUrl", "z1", "Lhn6;", "cashNotes", "K0", "Lt51;", "result", "checkoutState", "J0", "G0", "", "isDelivery", "orderId", "F0", "Los7;", "payment", "Lin6;", "moneyDetails", "I1", "Lj4c;", "scenario", "M1", "Lap2;", "F1", "paymentSum", "H1", "Ll95;", "K1", "E1", "B0", "(Los7;Lcv1;)Ljava/lang/Object;", "A0", "C0", "merchantId", "gateway", "googlePayDataString", "G1", "J1", "L1", "Lj3a;", "resultData", "m1", "W1", "state", "N1", "O1", "Q1", "r1", "q1", "P1", "s1", "D0", "isTakeaway", "V0", "", "tableNumber", "R0", "Ljw7;", "paymentWay", "Ld88;", "pizzeria", "Y0", "", "deferredTime", "L0", "(Ljava/lang/Long;)V", "title", "isSuggested", "positionSelected", "T0", "(Ljava/lang/Long;Ljava/lang/String;ZLru/dodopizza/app/presentation/checkout/details/a$a;I)V", "isRedirectSavedCardChecked", "b1", "a1", "persistCurrentTimes", "U0", "(Ljava/lang/Long;Ljava/lang/String;ZLru/dodopizza/app/presentation/checkout/details/a$a;Z)V", "Lou2;", "selectedDeliverablePlace", "setDeliveryOrderType", "N0", "newDeliverablePlace", "M0", "details", "isEmptyCart", "u1", "X0", "I0", "E0", "Le91;", "clientDeliveryLocation", "Lck1;", "sender", "t1", "C1", "hasAddresses", "B1", "addressDetailsClientDeliveryLocation", "A1", "O0", "Q0", "newClientDeliveryLocation", "oldClientDeliveryLocation", "P0", "Llk7$d;", KustoStorage.KustoTable.COLUMN_SOURCE, "o1", "isNearestPizzeria", "p1", "(Ld88;Llk7$d;Ljava/lang/Boolean;)V", "g1", "n1", "h1", "y1", "W0", "isSelected", "c1", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "V1", "U1", "t", "onDestroy", "b", "Lb61;", "initialCheckoutState", "Li41;", com.huawei.hms.opendevice.c.a, "Li41;", "interactor", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "Ldt5;", "currentLocality", "Lf63;", com.huawei.hms.push.e.a, "Lf63;", "checkoutRouter", "f", "globalRouter", "Lhq3;", "g", "Lhq3;", "featureService", "Lay1;", Image.TYPE_HIGH, "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lxtb;", "i", "Lxtb;", "urlOpener", "Lgc;", "j", "Lgc;", "analytics", "Lwt9;", "k", "Lwt9;", "sberPayFinishDeepLinkBuilder", "Ls41;", "l", "Ls41;", "router", "Lih4;", Image.TYPE_MEDIUM, "Lih4;", "googlePlayServicesHelper", "n", "Lkotlin/jvm/functions/Function1;", "getCheckoutScreenResultHandler", "()Lkotlin/jvm/functions/Function1;", "checkoutScreenResultHandler", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "o", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lb61;Li41;Ldt5;Lf63;Lf63;Lhq3;Lay1;Lxtb;Lgc;Lwt9;Ls41;Lih4;)V", "p", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CheckoutDetailsPresenter extends MoxyFSMPresenter<w41, ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> {
    public static final a p = new a(null);
    private final b61 b;
    private final i41 c;
    private final dt5 d;
    private final f63 e;
    private final f63 f;
    private final hq3 g;
    private final ay1 h;
    private final xtb i;
    private final gc j;
    private final wt9 k;
    private final s41 l;
    private final ih4 m;
    private final Function1<v51, Unit> n;
    private final Logger o;

    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter$a;", "", "", "RESULT_CART_ERRORS", "I", "RESULT_SELECT_PIZZERIA", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliveryToTableSelected$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((a0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleReusablePackageSwitchToggled$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a1 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a1(cv1<? super a1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            a1 a1Var = new a1(cv1Var);
            a1Var.b = th;
            return a1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed update reusable package state", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$switchToDelivery$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a2 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a2(cv1<? super a2> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            a2 a2Var = new a2(cv1Var);
            a2Var.b = th;
            return a2Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed switch to delivery. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter", f = "CheckoutDetailsPresenter.kt", l = {887}, m = "chargeApp2AppPayment")
    /* loaded from: classes4.dex */
    public static final class b extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CheckoutDetailsPresenter.this.A0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliveryToTableSelected$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b0(cv1<? super b0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b0 b0Var = new b0(cv1Var);
            b0Var.b = obj;
            return b0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((b0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b1 extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>, Unit> {
            final /* synthetic */ CheckoutDetailsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/checkout/details/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b1$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0524a extends ej5 implements Function2<a.C0211a, a.b, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0524a(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(a.C0211a c0211a, a.b bVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.S1();
                    return this.a.g1();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                super(1);
                this.a = checkoutDetailsPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                z65.h(aVar, "$this$state");
                C0524a c0524a = new C0524a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(c0524a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>, Unit> {
            final /* synthetic */ CheckoutDetailsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$d1;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$d1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<b.d1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.d1 d1Var, a.C0528a c0528a) {
                    z65.h(d1Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.z(d.e.a, c0528a);
                    this.a.Q1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$c1;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$c1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b1$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0525b extends ej5 implements Function2<b.c1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0525b(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.c1 c1Var, a.C0528a c0528a) {
                    z65.h(c1Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.z(d.e.a, c0528a);
                    this.a.e1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$e0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$e0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<b.e0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.e0 e0Var, a.C0528a c0528a) {
                    z65.h(e0Var, "event");
                    z65.h(c0528a, "data");
                    this.a.z(d.e.a, c0528a);
                    this.a.V0(e0Var.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$b1;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$b1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<b.b1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.b1 b1Var, a.C0528a c0528a) {
                    z65.h(b1Var, "event");
                    z65.h(c0528a, "data");
                    this.a.l.k(b1Var.a(), this.a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$a;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<b.a, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.a aVar, a.C0528a c0528a) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.O0(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$l;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$l;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class f extends ej5 implements Function2<b.l, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.l lVar, a.C0528a c0528a) {
                    z65.h(lVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.Q0(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$b;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$b;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<b.C0529b, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.C0529b c0529b, a.C0528a c0528a) {
                    z65.h(c0529b, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    return this.a.H0(c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$m;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$m;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class h extends ej5 implements Function2<b.m, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.m mVar, a.C0528a c0528a) {
                    z65.h(mVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    if (!c0528a.b().k().d()) {
                        return this.a.K0(c0528a, null);
                    }
                    if (!(c0528a.b().m() instanceof zo7.c)) {
                        this.a.K0(c0528a, null);
                    } else {
                        ((w41) this.a.getViewState()).E6(c0528a.b().o());
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$g0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$g0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class i extends ej5 implements Function2<b.g0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.g0 g0Var, a.C0528a c0528a) {
                    z65.h(g0Var, "event");
                    z65.h(c0528a, "data");
                    this.a.z1(g0Var.a());
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$n;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$n;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class j extends ej5 implements Function2<b.n, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.n nVar, a.C0528a c0528a) {
                    z65.h(nVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.j1(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$i0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$i0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class k extends ej5 implements Function2<b.i0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.i0 i0Var, a.C0528a c0528a) {
                    z65.h(i0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$g;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$g;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class l extends ej5 implements Function2<b.g, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.g gVar, a.C0528a c0528a) {
                    z65.h(gVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.e.d();
                    this.a.f.l(R.id.checkout_cart_errors, v51.b.a);
                    return new bua<>(d.a.a, a.b.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$c0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$c0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class m extends ej5 implements Function2<b.c0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                m(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.c0 c0Var, a.C0528a c0528a) {
                    z65.h(c0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.j.a(new j6b(k6b.c, l6b.b.b));
                    return this.a.K0(c0528a.a(b61.b(c0528a.b(), null, null, new zo7.d(true), null, null, null, null, null, null, null, null, false, null, 8187, null)), null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$b0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$b0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class n extends ej5 implements Function2<b.b0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.b0 b0Var, a.C0528a c0528a) {
                    z65.h(b0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.j.a(new j6b(k6b.b, l6b.b.b));
                    return this.a.K0(c0528a.a(b61.b(c0528a.b(), null, null, new zo7.d(false), null, null, null, null, null, null, null, null, false, null, 8187, null)), null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$d0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$d0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class o extends ej5 implements Function2<b.d0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                o(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.d0 d0Var, a.C0528a c0528a) {
                    z65.h(d0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.j.a(new i6b(l6b.b.b));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$l0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$l0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class p extends ej5 implements Function2<b.l0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                p(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.l0 l0Var, a.C0528a c0528a) {
                    z65.h(l0Var, "event");
                    z65.h(c0528a, "data");
                    this.a.j.a(hc3.a.b(l0Var.a()));
                    this.a.c1(l0Var.a());
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$k0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$k0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class q extends ej5 implements Function2<b.k0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                q(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.k0 k0Var, a.C0528a c0528a) {
                    z65.h(k0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.j.a(hc3.a.a());
                    ((w41) this.a.getViewState()).lc(k0Var.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$a0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$a0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class r extends ej5 implements Function2<b.a0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                r(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.a0 a0Var, a.C0528a c0528a) {
                    z65.h(a0Var, "event");
                    z65.h(c0528a, "data");
                    this.a.z(d.e.a, c0528a);
                    this.a.T0(a0Var.a(), a0Var.c(), a0Var.d(), c0528a, a0Var.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$d;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$d;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class s extends ej5 implements Function2<b.d, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                s(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.d dVar, a.C0528a c0528a) {
                    z65.h(dVar, "event");
                    z65.h(c0528a, "data");
                    this.a.j.a(dd.f(dVar.a(), true));
                    this.a.i1(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$h0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$h0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class t extends ej5 implements Function2<b.h0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                t(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.h0 h0Var, a.C0528a c0528a) {
                    z65.h(h0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.D1(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$f0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$f0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class u extends ej5 implements Function2<b.f0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                u(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.f0 f0Var, a.C0528a c0528a) {
                    z65.h(f0Var, "event");
                    z65.h(c0528a, "data");
                    this.a.b1(f0Var.a());
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$x0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$x0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class v extends ej5 implements Function2<b.x0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                v(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.x0 x0Var, a.C0528a c0528a) {
                    z65.h(x0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.D1(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$c;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class w extends ej5 implements Function2<b.c, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                w(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.c cVar, a.C0528a c0528a) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.I0(c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$y0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$y0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class x extends ej5 implements Function2<b.y0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                x(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.y0 y0Var, a.C0528a c0528a) {
                    z65.h(y0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.x1(fn3.b, c0528a);
                    return new bua<>(d.e.a, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$x;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$x;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class y extends ej5 implements Function2<b.x, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                y(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.x xVar, a.C0528a c0528a) {
                    z65.h(xVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.T1(c0528a);
                    this.a.e.d();
                    this.a.f.l(R.id.checkout_cart_errors, v51.b.a);
                    this.a.f.f(h56.c(null, 1, null));
                    return new bua<>(d.a.a, a.b.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                super(1);
                this.a = checkoutDetailsPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                z65.h(aVar, "$this$state");
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(b.i0.class)) {
                    aVar.b().put(b.i0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map = aVar.b().get(b.i0.class);
                z65.e(map);
                map.put(a.C0528a.class, (Function2) unb.e(kVar, 2));
                r rVar = new r(this.a);
                if (!aVar.b().containsKey(b.a0.class)) {
                    aVar.b().put(b.a0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map2 = aVar.b().get(b.a0.class);
                z65.e(map2);
                map2.put(a.C0528a.class, (Function2) unb.e(rVar, 2));
                s sVar = new s(this.a);
                if (!aVar.b().containsKey(b.d.class)) {
                    aVar.b().put(b.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map3 = aVar.b().get(b.d.class);
                z65.e(map3);
                map3.put(a.C0528a.class, (Function2) unb.e(sVar, 2));
                t tVar = new t(this.a);
                if (!aVar.b().containsKey(b.h0.class)) {
                    aVar.b().put(b.h0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map4 = aVar.b().get(b.h0.class);
                z65.e(map4);
                map4.put(a.C0528a.class, (Function2) unb.e(tVar, 2));
                u uVar = new u(this.a);
                if (!aVar.b().containsKey(b.f0.class)) {
                    aVar.b().put(b.f0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map5 = aVar.b().get(b.f0.class);
                z65.e(map5);
                map5.put(a.C0528a.class, (Function2) unb.e(uVar, 2));
                v vVar = new v(this.a);
                if (!aVar.b().containsKey(b.x0.class)) {
                    aVar.b().put(b.x0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map6 = aVar.b().get(b.x0.class);
                z65.e(map6);
                map6.put(a.C0528a.class, (Function2) unb.e(vVar, 2));
                w wVar = new w(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map7 = aVar.b().get(b.c.class);
                z65.e(map7);
                map7.put(a.C0528a.class, (Function2) unb.e(wVar, 2));
                x xVar = new x(this.a);
                if (!aVar.b().containsKey(b.y0.class)) {
                    aVar.b().put(b.y0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map8 = aVar.b().get(b.y0.class);
                z65.e(map8);
                map8.put(a.C0528a.class, (Function2) unb.e(xVar, 2));
                y yVar = new y(this.a);
                if (!aVar.b().containsKey(b.x.class)) {
                    aVar.b().put(b.x.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map9 = aVar.b().get(b.x.class);
                z65.e(map9);
                map9.put(a.C0528a.class, (Function2) unb.e(yVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.d1.class)) {
                    aVar.b().put(b.d1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map10 = aVar.b().get(b.d1.class);
                z65.e(map10);
                map10.put(a.C0528a.class, (Function2) unb.e(aVar2, 2));
                C0525b c0525b = new C0525b(this.a);
                if (!aVar.b().containsKey(b.c1.class)) {
                    aVar.b().put(b.c1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map11 = aVar.b().get(b.c1.class);
                z65.e(map11);
                map11.put(a.C0528a.class, (Function2) unb.e(c0525b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.e0.class)) {
                    aVar.b().put(b.e0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map12 = aVar.b().get(b.e0.class);
                z65.e(map12);
                map12.put(a.C0528a.class, (Function2) unb.e(cVar, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.b1.class)) {
                    aVar.b().put(b.b1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map13 = aVar.b().get(b.b1.class);
                z65.e(map13);
                map13.put(a.C0528a.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map14 = aVar.b().get(b.a.class);
                z65.e(map14);
                map14.put(a.C0528a.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(b.l.class)) {
                    aVar.b().put(b.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map15 = aVar.b().get(b.l.class);
                z65.e(map15);
                map15.put(a.C0528a.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(b.C0529b.class)) {
                    aVar.b().put(b.C0529b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map16 = aVar.b().get(b.C0529b.class);
                z65.e(map16);
                map16.put(a.C0528a.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(b.m.class)) {
                    aVar.b().put(b.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map17 = aVar.b().get(b.m.class);
                z65.e(map17);
                map17.put(a.C0528a.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(b.g0.class)) {
                    aVar.b().put(b.g0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map18 = aVar.b().get(b.g0.class);
                z65.e(map18);
                map18.put(a.C0528a.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(b.n.class)) {
                    aVar.b().put(b.n.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map19 = aVar.b().get(b.n.class);
                z65.e(map19);
                map19.put(a.C0528a.class, (Function2) unb.e(jVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(b.g.class)) {
                    aVar.b().put(b.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map20 = aVar.b().get(b.g.class);
                z65.e(map20);
                map20.put(a.C0528a.class, (Function2) unb.e(lVar, 2));
                m mVar = new m(this.a);
                if (!aVar.b().containsKey(b.c0.class)) {
                    aVar.b().put(b.c0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map21 = aVar.b().get(b.c0.class);
                z65.e(map21);
                map21.put(a.C0528a.class, (Function2) unb.e(mVar, 2));
                n nVar = new n(this.a);
                if (!aVar.b().containsKey(b.b0.class)) {
                    aVar.b().put(b.b0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map22 = aVar.b().get(b.b0.class);
                z65.e(map22);
                map22.put(a.C0528a.class, (Function2) unb.e(nVar, 2));
                o oVar = new o(this.a);
                if (!aVar.b().containsKey(b.d0.class)) {
                    aVar.b().put(b.d0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map23 = aVar.b().get(b.d0.class);
                z65.e(map23);
                map23.put(a.C0528a.class, (Function2) unb.e(oVar, 2));
                p pVar = new p(this.a);
                if (!aVar.b().containsKey(b.l0.class)) {
                    aVar.b().put(b.l0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map24 = aVar.b().get(b.l0.class);
                z65.e(map24);
                map24.put(a.C0528a.class, (Function2) unb.e(pVar, 2));
                q qVar = new q(this.a);
                if (!aVar.b().containsKey(b.k0.class)) {
                    aVar.b().put(b.k0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map25 = aVar.b().get(b.k0.class);
                z65.e(map25);
                map25.put(a.C0528a.class, (Function2) unb.e(qVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>, Unit> {
            final /* synthetic */ CheckoutDetailsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$s0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$s0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<b.s0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.s0 s0Var, a.C0528a c0528a) {
                    z65.h(s0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.o1(s0Var.a(), s0Var.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$z0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$z0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<b.z0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.z0 z0Var, a.C0528a c0528a) {
                    z65.h(z0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.p1(z0Var.a(), z0Var.b(), z0Var.c());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$t0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$t0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b1$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0526c extends ej5 implements Function2<b.t0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0526c(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.t0 t0Var, a.C0528a c0528a) {
                    z65.h(t0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.L0(t0Var.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$k;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$k;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<b.k, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.k kVar, a.C0528a c0528a) {
                    z65.h(kVar, "event");
                    z65.h(c0528a, "data");
                    return this.a.K0(c0528a, kVar.a());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$q;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$q;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<b.q, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.q qVar, a.C0528a c0528a) {
                    z65.h(qVar, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.R0(qVar.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$r;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$r;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class f extends ej5 implements Function2<b.r, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.r rVar, a.C0528a c0528a) {
                    z65.h(rVar, "event");
                    z65.h(c0528a, "data");
                    this.a.j.a(new j6b(k6b.d, l6b.b.b));
                    return this.a.K0(c0528a.a(b61.b(c0528a.b(), null, null, new zo7.a(rVar.a()), null, null, null, null, null, null, null, null, false, null, 8187, null)), null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$z;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$z;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<b.z, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.z zVar, a.C0528a c0528a) {
                    z65.h(zVar, "event");
                    z65.h(c0528a, "data");
                    this.a.U0(zVar.a(), zVar.b(), zVar.c(), c0528a, false);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$j0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$j0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class h extends ej5 implements Function2<b.j0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.j0 j0Var, a.C0528a c0528a) {
                    z65.h(j0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    return this.a.Z0(c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$u0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$u0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class i extends ej5 implements Function2<b.u0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.u0 u0Var, a.C0528a c0528a) {
                    z65.h(u0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.N0(u0Var.a(), u0Var.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$v0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$v0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class j extends ej5 implements Function2<b.v0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.v0 v0Var, a.C0528a c0528a) {
                    z65.h(v0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.d1(v0Var.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$w;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$w;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class k extends ej5 implements Function2<b.w, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.w wVar, a.C0528a c0528a) {
                    z65.h(wVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.e.d();
                    this.a.f.l(R.id.checkout_cart_errors, v51.b.a);
                    this.a.f.f(h56.c(null, 1, null));
                    return new bua<>(d.a.a, a.b.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$y;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$y;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class l extends ej5 implements Function2<b.y, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.y yVar, a.C0528a c0528a) {
                    z65.h(yVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.l1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$o;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$o;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class m extends ej5 implements Function2<b.o, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                m(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.o oVar, a.C0528a c0528a) {
                    z65.h(oVar, "event");
                    z65.h(c0528a, "data");
                    this.a.M0(oVar.a(), c0528a, oVar.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$p;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$p;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class n extends ej5 implements Function2<b.p, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.p pVar, a.C0528a c0528a) {
                    z65.h(pVar, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.P0(pVar.a(), pVar.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$w0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$w0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class o extends ej5 implements Function2<b.w0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                o(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.w0 w0Var, a.C0528a c0528a) {
                    z65.h(w0Var, "event");
                    z65.h(c0528a, "data");
                    this.a.Y0(w0Var.a(), yk7.a(c0528a.b().k()));
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                super(1);
                this.a = checkoutDetailsPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                z65.h(aVar, "$this$state");
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(b.z.class)) {
                    aVar.b().put(b.z.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map = aVar.b().get(b.z.class);
                z65.e(map);
                map.put(a.C0528a.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(b.j0.class)) {
                    aVar.b().put(b.j0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map2 = aVar.b().get(b.j0.class);
                z65.e(map2);
                map2.put(a.C0528a.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(b.u0.class)) {
                    aVar.b().put(b.u0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map3 = aVar.b().get(b.u0.class);
                z65.e(map3);
                map3.put(a.C0528a.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(b.v0.class)) {
                    aVar.b().put(b.v0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map4 = aVar.b().get(b.v0.class);
                z65.e(map4);
                map4.put(a.C0528a.class, (Function2) unb.e(jVar, 2));
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(b.w.class)) {
                    aVar.b().put(b.w.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map5 = aVar.b().get(b.w.class);
                z65.e(map5);
                map5.put(a.C0528a.class, (Function2) unb.e(kVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(b.y.class)) {
                    aVar.b().put(b.y.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map6 = aVar.b().get(b.y.class);
                z65.e(map6);
                map6.put(a.C0528a.class, (Function2) unb.e(lVar, 2));
                m mVar = new m(this.a);
                if (!aVar.b().containsKey(b.o.class)) {
                    aVar.b().put(b.o.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map7 = aVar.b().get(b.o.class);
                z65.e(map7);
                map7.put(a.C0528a.class, (Function2) unb.e(mVar, 2));
                n nVar = new n(this.a);
                if (!aVar.b().containsKey(b.p.class)) {
                    aVar.b().put(b.p.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map8 = aVar.b().get(b.p.class);
                z65.e(map8);
                map8.put(a.C0528a.class, (Function2) unb.e(nVar, 2));
                o oVar = new o(this.a);
                if (!aVar.b().containsKey(b.w0.class)) {
                    aVar.b().put(b.w0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map9 = aVar.b().get(b.w0.class);
                z65.e(map9);
                map9.put(a.C0528a.class, (Function2) unb.e(oVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.s0.class)) {
                    aVar.b().put(b.s0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map10 = aVar.b().get(b.s0.class);
                z65.e(map10);
                map10.put(a.C0528a.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.z0.class)) {
                    aVar.b().put(b.z0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map11 = aVar.b().get(b.z0.class);
                z65.e(map11);
                map11.put(a.C0528a.class, (Function2) unb.e(bVar, 2));
                C0526c c0526c = new C0526c(this.a);
                if (!aVar.b().containsKey(b.t0.class)) {
                    aVar.b().put(b.t0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map12 = aVar.b().get(b.t0.class);
                z65.e(map12);
                map12.put(a.C0528a.class, (Function2) unb.e(c0526c, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.k.class)) {
                    aVar.b().put(b.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map13 = aVar.b().get(b.k.class);
                z65.e(map13);
                map13.put(a.C0528a.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.q.class)) {
                    aVar.b().put(b.q.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map14 = aVar.b().get(b.q.class);
                z65.e(map14);
                map14.put(a.C0528a.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(b.r.class)) {
                    aVar.b().put(b.r.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map15 = aVar.b().get(b.r.class);
                z65.e(map15);
                map15.put(a.C0528a.class, (Function2) unb.e(fVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>, Unit> {
            final /* synthetic */ CheckoutDetailsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$v;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$v;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<b.v, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.v vVar, a.C0528a c0528a) {
                    z65.h(vVar, "event");
                    z65.h(c0528a, "data");
                    this.a.z(d.C0531d.a, c0528a);
                    return this.a.S0(vVar, c0528a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$u;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$u;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<b.u, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.u uVar, a.C0528a c0528a) {
                    z65.h(uVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$t;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$t;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<b.t, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.t tVar, a.C0528a c0528a) {
                    z65.h(tVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$n0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$n0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b1$d$d  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0527d extends ej5 implements Function2<b.n0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0527d(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.n0 n0Var, a.C0528a c0528a) {
                    z65.h(n0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.l1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$f;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$f;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<b.f, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.f fVar, a.C0528a c0528a) {
                    z65.h(fVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$y;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$y;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class f extends ej5 implements Function2<b.y, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.y yVar, a.C0528a c0528a) {
                    z65.h(yVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "data");
                    this.a.l1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$a1;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$a1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<b.a1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.a1 a1Var, a.C0528a c0528a) {
                    z65.h(a1Var, "event");
                    z65.h(c0528a, "data");
                    ((w41) this.a.getViewState()).V3(c0528a.b());
                    ((w41) this.a.getViewState()).x1(a1Var.b(), a1Var.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$p0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$p0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class h extends ej5 implements Function2<b.p0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.p0 p0Var, a.C0528a c0528a) {
                    z65.h(p0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$m0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$m0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class i extends ej5 implements Function2<b.m0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.m0 m0Var, a.C0528a c0528a) {
                    z65.h(m0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.o.warn("Failed to open the SberPay deeplink", m0Var.a());
                    this.a.j.a(ao3.a.b(m0Var.b(), ck1.o));
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$e;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$e;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class j extends ej5 implements Function2<b.e, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.e eVar, a.C0528a c0528a) {
                    z65.h(eVar, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.o.warn("Failed to open the KaspiPay url", eVar.a());
                    this.a.j.a(ao3.a.b(eVar.b(), ck1.o));
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$r0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$r0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class k extends ej5 implements Function2<b.r0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.r0 r0Var, a.C0528a c0528a) {
                    z65.h(r0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.m1(r0Var.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$o0;", "event", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$o0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class l extends ej5 implements Function2<b.o0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.o0 o0Var, a.C0528a c0528a) {
                    z65.h(o0Var, "event");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.o.warn("Failed to open the SBP url", o0Var.a());
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$q0;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$q0;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class m extends ej5 implements Function2<b.q0, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                m(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.q0 q0Var, a.C0528a c0528a) {
                    z65.h(q0Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$s;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$s;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class n extends ej5 implements Function2<b.s, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.s sVar, a.C0528a c0528a) {
                    z65.h(sVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$f1;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$f1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class o extends ej5 implements Function2<b.f1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                o(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.f1 f1Var, a.C0528a c0528a) {
                    z65.h(f1Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$e1;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$e1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class p extends ej5 implements Function2<b.e1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                p(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.e1 e1Var, a.C0528a c0528a) {
                    z65.h(e1Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$g1;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$g1;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class q extends ej5 implements Function2<b.g1, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                q(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.g1 g1Var, a.C0528a c0528a) {
                    z65.h(g1Var, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$h;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$h;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class r extends ej5 implements Function2<b.h, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                r(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.h hVar, a.C0528a c0528a) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$j;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$j;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class s extends ej5 implements Function2<b.j, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                s(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.j jVar, a.C0528a c0528a) {
                    z65.h(jVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.W1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutDetailsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$i;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/details/d;", "Lru/dodopizza/app/presentation/checkout/details/a;", "a", "(Lru/dodopizza/app/presentation/checkout/details/b$i;Lru/dodopizza/app/presentation/checkout/details/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class t extends ej5 implements Function2<b.i, a.C0528a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>> {
                final /* synthetic */ CheckoutDetailsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                t(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                    super(2);
                    this.a = checkoutDetailsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> invoke(b.i iVar, a.C0528a c0528a) {
                    z65.h(iVar, "<anonymous parameter 0>");
                    z65.h(c0528a, "<anonymous parameter 1>");
                    this.a.X0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(CheckoutDetailsPresenter checkoutDetailsPresenter) {
                super(1);
                this.a = checkoutDetailsPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                z65.h(aVar, "$this$state");
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(b.r0.class)) {
                    aVar.b().put(b.r0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map = aVar.b().get(b.r0.class);
                z65.e(map);
                map.put(a.C0528a.class, (Function2) unb.e(kVar, 2));
                m mVar = new m(this.a);
                if (!aVar.b().containsKey(b.q0.class)) {
                    aVar.b().put(b.q0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map2 = aVar.b().get(b.q0.class);
                z65.e(map2);
                map2.put(a.C0528a.class, (Function2) unb.e(mVar, 2));
                n nVar = new n(this.a);
                if (!aVar.b().containsKey(b.s.class)) {
                    aVar.b().put(b.s.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map3 = aVar.b().get(b.s.class);
                z65.e(map3);
                map3.put(a.C0528a.class, (Function2) unb.e(nVar, 2));
                o oVar = new o(this.a);
                if (!aVar.b().containsKey(b.f1.class)) {
                    aVar.b().put(b.f1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map4 = aVar.b().get(b.f1.class);
                z65.e(map4);
                map4.put(a.C0528a.class, (Function2) unb.e(oVar, 2));
                p pVar = new p(this.a);
                if (!aVar.b().containsKey(b.e1.class)) {
                    aVar.b().put(b.e1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map5 = aVar.b().get(b.e1.class);
                z65.e(map5);
                map5.put(a.C0528a.class, (Function2) unb.e(pVar, 2));
                q qVar = new q(this.a);
                if (!aVar.b().containsKey(b.g1.class)) {
                    aVar.b().put(b.g1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map6 = aVar.b().get(b.g1.class);
                z65.e(map6);
                map6.put(a.C0528a.class, (Function2) unb.e(qVar, 2));
                r rVar = new r(this.a);
                if (!aVar.b().containsKey(b.h.class)) {
                    aVar.b().put(b.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map7 = aVar.b().get(b.h.class);
                z65.e(map7);
                map7.put(a.C0528a.class, (Function2) unb.e(rVar, 2));
                s sVar = new s(this.a);
                if (!aVar.b().containsKey(b.j.class)) {
                    aVar.b().put(b.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map8 = aVar.b().get(b.j.class);
                z65.e(map8);
                map8.put(a.C0528a.class, (Function2) unb.e(sVar, 2));
                t tVar = new t(this.a);
                if (!aVar.b().containsKey(b.i.class)) {
                    aVar.b().put(b.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map9 = aVar.b().get(b.i.class);
                z65.e(map9);
                map9.put(a.C0528a.class, (Function2) unb.e(tVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.v.class)) {
                    aVar.b().put(b.v.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map10 = aVar.b().get(b.v.class);
                z65.e(map10);
                map10.put(a.C0528a.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.u.class)) {
                    aVar.b().put(b.u.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map11 = aVar.b().get(b.u.class);
                z65.e(map11);
                map11.put(a.C0528a.class, (Function2) unb.e(bVar, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.t.class)) {
                    aVar.b().put(b.t.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map12 = aVar.b().get(b.t.class);
                z65.e(map12);
                map12.put(a.C0528a.class, (Function2) unb.e(cVar, 2));
                C0527d c0527d = new C0527d(this.a);
                if (!aVar.b().containsKey(b.n0.class)) {
                    aVar.b().put(b.n0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map13 = aVar.b().get(b.n0.class);
                z65.e(map13);
                map13.put(a.C0528a.class, (Function2) unb.e(c0527d, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.f.class)) {
                    aVar.b().put(b.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map14 = aVar.b().get(b.f.class);
                z65.e(map14);
                map14.put(a.C0528a.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(b.y.class)) {
                    aVar.b().put(b.y.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map15 = aVar.b().get(b.y.class);
                z65.e(map15);
                map15.put(a.C0528a.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(b.a1.class)) {
                    aVar.b().put(b.a1.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map16 = aVar.b().get(b.a1.class);
                z65.e(map16);
                map16.put(a.C0528a.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(b.p0.class)) {
                    aVar.b().put(b.p0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map17 = aVar.b().get(b.p0.class);
                z65.e(map17);
                map17.put(a.C0528a.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(b.m0.class)) {
                    aVar.b().put(b.m0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map18 = aVar.b().get(b.m0.class);
                z65.e(map18);
                map18.put(a.C0528a.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(b.e.class)) {
                    aVar.b().put(b.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map19 = aVar.b().get(b.e.class);
                z65.e(map19);
                map19.put(a.C0528a.class, (Function2) unb.e(jVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(b.o0.class)) {
                    aVar.b().put(b.o0.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>> map20 = aVar.b().get(b.o0.class);
                z65.e(map20);
                map20.put(a.C0528a.class, (Function2) unb.e(lVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>.a<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        b1() {
            super(1);
        }

        public final void a(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(CheckoutDetailsPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.details.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(d.c.class, aVar2.a());
            b bVar = new b(CheckoutDetailsPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.details.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(d.b.class, aVar3.a());
            c cVar = new c(CheckoutDetailsPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.details.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(d.e.class, aVar4.a());
            d dVar = new d(CheckoutDetailsPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.details.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.details.a, bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>>>>> c5 = ko3Var.c();
            ko3.a aVar5 = new ko3.a();
            dVar.invoke(aVar5);
            c5.put(d.C0531d.class, aVar5.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$switchToRestaurant$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b2 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b2(cv1<? super b2> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b2 b2Var = new b2(cv1Var);
            b2Var.b = obj;
            return b2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((b2) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter", f = "CheckoutDetailsPresenter.kt", l = {879}, m = "chargeSberPayPayment")
    /* loaded from: classes4.dex */
    public static final class c extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CheckoutDetailsPresenter.this.B0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliveryToTableSelected$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c0(cv1<? super c0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            c0 c0Var = new c0(cv1Var);
            c0Var.b = th;
            return c0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to set setDeliveryTableNumber. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$refreshCheckoutDetails$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c1(cv1<? super c1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c1 c1Var = new c1(cv1Var);
            c1Var.b = obj;
            return c1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((c1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "newState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$switchToRestaurant$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c2 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c2(cv1<? super c2> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c2 c2Var = new c2(cv1Var);
            c2Var.b = obj;
            return c2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((c2) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b61 b61Var = (b61) this.b;
                if (b61Var.k() instanceof nk9.a) {
                    CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter.x1(fn3.b, checkoutDetailsPresenter.R1(b61Var));
                    CheckoutDetailsPresenter checkoutDetailsPresenter2 = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter2.z(d.e.a, checkoutDetailsPresenter2.R1(b61Var));
                } else {
                    CheckoutDetailsPresenter checkoutDetailsPresenter3 = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter3.z(d.b.a, checkoutDetailsPresenter3.R1(b61Var));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$chargeSbpPayment$$inlined$onSuccessType$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<ts7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ CheckoutDetailsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(cv1 cv1Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
            super(2, cv1Var);
            this.c = checkoutDetailsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var, this.c);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ts7 ts7Var, cv1<? super Unit> cv1Var) {
            return ((d) create(ts7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object obj2 = this.b;
                if (obj2 instanceof ts7.b) {
                    qs7 a = ((ts7.b) obj2).a();
                    if (a instanceof vs7) {
                        this.c.W1();
                    } else if (a instanceof ss7) {
                        this.c.W1();
                    } else if (a instanceof rs7) {
                        this.c.l.e((rs7) a, this.c);
                    } else if (a instanceof us7) {
                        this.c.z1(((us7) a).b());
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleGooglePaySuccessEvent$$inlined$onSuccessType$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d0 extends f3b implements Function2<ts7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ CheckoutDetailsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(cv1 cv1Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
            super(2, cv1Var);
            this.c = checkoutDetailsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(cv1Var, this.c);
            d0Var.b = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ts7 ts7Var, cv1<? super Unit> cv1Var) {
            return ((d0) create(ts7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object obj2 = this.b;
                if (obj2 instanceof ts7.b) {
                    qs7 a = ((ts7.b) obj2).a();
                    if (a instanceof vs7) {
                        this.c.W1();
                    } else if (a instanceof ss7) {
                        this.c.W1();
                    } else if (a instanceof rs7) {
                        this.c.l.e((rs7) a, this.c);
                    } else {
                        this.c.o.warn("Wrong status for GooglePay");
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$refreshCheckoutDetails$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d1(cv1<? super d1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d1 d1Var = new d1(cv1Var);
            d1Var.b = obj;
            return d1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((d1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$switchToRestaurant$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d2 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d2(cv1<? super d2> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            d2 d2Var = new d2(cv1Var);
            d2Var.b = th;
            return d2Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed switch to restaurant. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$chargeSbpPayment$$inlined$onSuccessType$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<ts7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ CheckoutDetailsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(cv1 cv1Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
            super(2, cv1Var);
            this.c = checkoutDetailsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var, this.c);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ts7 ts7Var, cv1<? super Unit> cv1Var) {
            return ((e) create(ts7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object obj2 = this.b;
                if (obj2 instanceof ts7.a) {
                    this.c.o.warn("Failed to charge SBP");
                    CheckoutDetailsPresenter checkoutDetailsPresenter = this.c;
                    checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1(((ts7.a) obj2).a()));
                    ((w41) this.c.getViewState()).L8();
                    this.c.l1();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleGooglePaySuccessEvent$$inlined$onSuccessType$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e0 extends f3b implements Function2<ts7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ CheckoutDetailsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(cv1 cv1Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
            super(2, cv1Var);
            this.c = checkoutDetailsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e0 e0Var = new e0(cv1Var, this.c);
            e0Var.b = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ts7 ts7Var, cv1<? super Unit> cv1Var) {
            return ((e0) create(ts7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object obj2 = this.b;
                if (obj2 instanceof ts7.a) {
                    CheckoutDetailsPresenter checkoutDetailsPresenter = this.c;
                    checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1(((ts7.a) obj2).a()));
                    ((w41) this.c.getViewState()).L8();
                    this.c.l1();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$refreshCheckoutDetails$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e1 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e1(cv1<? super e1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            e1 e1Var = new e1(cv1Var);
            e1Var.b = th;
            return e1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to refresh checkout details. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$trackCheckoutOpen$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e2 extends f3b implements y84<pz3<?>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e2(cv1<? super e2> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<?> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            e2 e2Var = new e2(cv1Var);
            e2Var.b = th;
            return e2Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to track checkout open event. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lts7;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$chargeSbpPayment$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements y84<pz3<? super ts7>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ts7> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to charge SBP", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lts7;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleGooglePaySuccessEvent$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f0 extends f3b implements y84<pz3<? super ts7>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.C0528a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(a.C0528a c0528a, cv1<? super f0> cv1Var) {
            super(3, cv1Var);
            this.d = c0528a;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ts7> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f0 f0Var = new f0(this.d, cv1Var);
            f0Var.b = th;
            return f0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to charge google pay with payment. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.z(d.b.a, this.d);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liq1;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$request3DSConfirmation$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f1 extends f3b implements Function2<iq1, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f1(cv1<? super f1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f1 f1Var = new f1(cv1Var);
            f1Var.b = obj;
            return f1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iq1 iq1Var, cv1<? super Unit> cv1Var) {
            return ((f1) create(iq1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                iq1 iq1Var = (iq1) this.b;
                if (iq1Var instanceof iq1.b) {
                    CheckoutDetailsPresenter.this.W1();
                } else if (iq1Var instanceof iq1.a) {
                    iq1.a aVar = (iq1.a) iq1Var;
                    CheckoutDetailsPresenter.this.s1(aVar.a());
                    CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1(aVar.a()));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lii7;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$waitForPaidOrder$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f2 extends f3b implements Function2<ii7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f2(cv1<? super f2> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f2 f2Var = new f2(cv1Var);
            f2Var.b = obj;
            return f2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ii7 ii7Var, cv1<? super Unit> cv1Var) {
            return ((f2) create(ii7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1(CheckoutDetailsPresenter.this.N1(((ii7) this.b).a()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv51;", "result", "", "a", "(Lv51;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<v51, Unit> {
        g() {
            super(1);
        }

        public final void a(v51 v51Var) {
            z65.h(v51Var, "result");
            if (!(v51Var instanceof v51.b)) {
                CheckoutDetailsPresenter.this.e.d();
                CheckoutDetailsPresenter.this.f.l(R.id.checkout_cart_errors, v51Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v51 v51Var) {
            a(v51Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "state", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleNewDeferredTimeSelection$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g0(cv1<? super g0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g0 g0Var = new g0(cv1Var);
            g0Var.b = obj;
            return g0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((g0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b61 b61Var = (b61) this.b;
                CheckoutDetailsPresenter.this.s1(b61Var);
                CheckoutDetailsPresenter.this.n1(b61Var);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Liq1;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$request3DSConfirmation$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g1 extends f3b implements y84<pz3<? super iq1>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g1(cv1<? super g1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super iq1> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            g1 g1Var = new g1(cv1Var);
            g1Var.b = th;
            return g1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to confirm 3DS. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lii7;", "response", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$waitForPaidOrder$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g2 extends f3b implements Function2<ii7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g2(cv1<? super g2> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g2 g2Var = new g2(cv1Var);
            g2Var.b = obj;
            return g2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ii7 ii7Var, cv1<? super Unit> cv1Var) {
            return ((g2) create(ii7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ii7 ii7Var = (ii7) this.b;
                if (!(ii7Var instanceof ii7.d)) {
                    if (ii7Var instanceof ii7.a) {
                        CheckoutDetailsPresenter.this.F0(ii7Var.a().k().b(), ((ii7.a) ii7Var).b());
                    } else if (ii7Var instanceof ii7.c) {
                        CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                        for (ik3 ik3Var : ((ii7.c) ii7Var).b()) {
                            ((w41) checkoutDetailsPresenter.getViewState()).V8(ik3Var);
                        }
                        CheckoutDetailsPresenter checkoutDetailsPresenter2 = CheckoutDetailsPresenter.this;
                        checkoutDetailsPresenter2.z(d.b.a, checkoutDetailsPresenter2.R1(ii7Var.a()));
                    } else if (ii7Var instanceof ii7.e) {
                        CheckoutDetailsPresenter.this.f.l(R.id.checkout_cart_errors, v51.b.a);
                        CheckoutDetailsPresenter.this.e.d();
                    } else if (ii7Var instanceof ii7.b) {
                        CheckoutDetailsPresenter.this.G0();
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter$h", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public h(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(xj7.class.getModifiers())) {
                String name = xj7.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + xj7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xj7, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public xj7 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleNewDeferredTimeSelection$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h0(cv1<? super h0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h0 h0Var = new h0(cv1Var);
            h0Var.b = obj;
            return h0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((h0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$selectCarryoutPizzeria$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h1(cv1<? super h1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h1 h1Var = new h1(cv1Var);
            h1Var.b = obj;
            return h1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((h1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lii7;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$waitForPaidOrder$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h2 extends f3b implements y84<pz3<? super ii7>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h2(cv1<? super h2> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ii7> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            h2 h2Var = new h2(cv1Var);
            h2Var.b = th;
            return h2Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.error("Failed to wait for paid order. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter$i", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public i(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(jj7.class.getModifiers())) {
                String name = jj7.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + jj7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [jj7, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public jj7 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleNewDeferredTimeSelection$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i0(cv1<? super i0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            i0 i0Var = new i0(cv1Var);
            i0Var.b = th;
            return i0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling deferred time selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$selectCarryoutPizzeria$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i1(cv1<? super i1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i1 i1Var = new i1(cv1Var);
            i1Var.b = obj;
            return i1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((i1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxj7;", "a", "()Lxj7;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function0<xj7> {
        final /* synthetic */ ej7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ej7 ej7Var) {
            super(0);
            this.a = ej7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xj7 invoke() {
            return xj7.d5.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePackagingChanged$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j0(cv1<? super j0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j0 j0Var = new j0(cv1Var);
            j0Var.b = obj;
            return j0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((j0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$selectCarryoutPizzeria$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j1 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j1(cv1<? super j1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            j1 j1Var = new j1(cv1Var);
            j1Var.b = th;
            return j1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling carryout pizzeria selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljj7;", "a", "()Ljj7;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function0<jj7> {
        final /* synthetic */ ej7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ej7 ej7Var) {
            super(0);
            this.a = ej7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final jj7 invoke() {
            return jj7.A.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePackagingChanged$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k0(cv1<? super k0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k0 k0Var = new k0(cv1Var);
            k0Var.b = obj;
            return k0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((k0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$selectRestaurantPizzeria$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k1(cv1<? super k1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k1 k1Var = new k1(cv1Var);
            k1Var.b = obj;
            return k1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((k1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lu51;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleCreateOrder$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements Function2<u51, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(u51 u51Var, cv1<? super Unit> cv1Var) {
            return ((l) create(u51Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1(((u51) this.b).a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePackagingChanged$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l0(cv1<? super l0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            l0 l0Var = new l0(cv1Var);
            l0Var.b = th;
            return l0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to set isTakeaway. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$selectRestaurantPizzeria$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l1(cv1<? super l1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l1 l1Var = new l1(cv1Var);
            l1Var.b = obj;
            return l1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((l1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lu51;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleCreateOrder$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<u51, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(u51 u51Var, cv1<? super Unit> cv1Var) {
            return ((m) create(u51Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                u51 u51Var = (u51) this.b;
                if ((u51Var instanceof u51.c) || (u51Var instanceof u51.b)) {
                    CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1(u51Var.a()));
                } else if (u51Var instanceof u51.a) {
                    CheckoutDetailsPresenter.this.J0(((u51.a) u51Var).b(), u51Var.a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentCanceled$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m0(cv1<? super m0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m0 m0Var = new m0(cv1Var);
            m0Var.b = obj;
            return m0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((m0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$selectRestaurantPizzeria$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m1 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m1(cv1<? super m1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            m1 m1Var = new m1(cv1Var);
            m1Var.b = th;
            return m1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling restaurant pizzeria selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lu51;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleCreateOrder$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements y84<pz3<? super u51>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super u51> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = th;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to request checkout. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentCanceled$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n0(cv1<? super n0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n0 n0Var = new n0(cv1Var);
            n0Var.b = obj;
            return n0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((n0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "discount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$showRestaurantDiscountIfRequired$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n1 extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n1(cv1<? super n1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n1 n1Var = new n1(cv1Var);
            n1Var.b = obj;
            return n1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((n1) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                if (str.length() > 0) {
                    ((w41) CheckoutDetailsPresenter.this.getViewState()).P0(str);
                } else {
                    ((w41) CheckoutDetailsPresenter.this.getViewState()).W();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeferredTimeSelection$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((o) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentCanceled$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        o0(cv1<? super o0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            o0 o0Var = new o0(cv1Var);
            o0Var.b = th;
            return o0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling payment canceled. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$showRestaurantDiscountIfRequired$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o1 extends f3b implements y84<pz3<? super String>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        o1(cv1<? super o1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super String> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            o1 o1Var = new o1(cv1Var);
            o1Var.b = th;
            return o1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to get information about discount. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeferredTimeSelection$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class p extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((p) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentError$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class p0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p0(cv1<? super p0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p0 p0Var = new p0(cv1Var);
            p0Var.b = obj;
            return p0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((p0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startApp2AppPaymentScenario$1", f = "CheckoutDetailsPresenter.kt", l = {869}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class p1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ os7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p1(os7 os7Var, cv1<? super p1> cv1Var) {
            super(2, cv1Var);
            this.d = os7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p1 p1Var = new p1(this.d, cv1Var);
            p1Var.b = obj;
            return p1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((p1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            qx1 qx1Var;
            Exception e;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    qx1Var = (qx1) this.b;
                    try {
                        vk9.b(obj);
                    } catch (Exception e2) {
                        e = e2;
                        rx1.f(qx1Var);
                        CheckoutDetailsPresenter.this.o.warn("Failed to initiate KaspiPay payment", (Throwable) e);
                        CheckoutDetailsPresenter.this.X0();
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                try {
                    CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                    os7 os7Var = this.d;
                    this.b = qx1Var2;
                    this.a = 1;
                    if (checkoutDetailsPresenter.A0(os7Var, this) == d) {
                        return d;
                    }
                } catch (Exception e3) {
                    qx1Var = qx1Var2;
                    e = e3;
                    rx1.f(qx1Var);
                    CheckoutDetailsPresenter.this.o.warn("Failed to initiate KaspiPay payment", (Throwable) e);
                    CheckoutDetailsPresenter.this.X0();
                    return Unit.a;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeferredTimeSelection$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = th;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling deferred time selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentError$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q0(cv1<? super q0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q0 q0Var = new q0(cv1Var);
            q0Var.b = obj;
            return q0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((q0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Le22;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startGooglePayPaymentScenario$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q1 extends f3b implements Function2<e22, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q1(cv1<? super q1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q1 q1Var = new q1(cv1Var);
            q1Var.b = obj;
            return q1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(e22 e22Var, cv1<? super Unit> cv1Var) {
            return ((q1) create(e22Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e22 e22Var = (e22) this.b;
                if (e22Var instanceof e22.c) {
                    CheckoutDetailsPresenter.this.s1(((e22.c) e22Var).a());
                } else if (e22Var instanceof e22.b) {
                    CheckoutDetailsPresenter.this.s1(((e22.b) e22Var).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliverablePlaceCreatedResult$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r rVar = new r(cv1Var);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((r) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentError$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r0(cv1<? super r0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            r0 r0Var = new r0(cv1Var);
            r0Var.b = th;
            return r0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling payment error. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Le22;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startGooglePayPaymentScenario$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r1 extends f3b implements Function2<e22, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ os7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r1(os7 os7Var, cv1<? super r1> cv1Var) {
            super(2, cv1Var);
            this.d = os7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r1 r1Var = new r1(this.d, cv1Var);
            r1Var.b = obj;
            return r1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(e22 e22Var, cv1<? super Unit> cv1Var) {
            return ((r1) create(e22Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e22 e22Var = (e22) this.b;
                if (e22Var instanceof e22.c) {
                    CheckoutDetailsPresenter.this.o.error("Failed to pay by GooglePay");
                    CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1(((e22.c) e22Var).a()));
                } else if (e22Var instanceof e22.b) {
                    e22.b bVar = (e22.b) e22Var;
                    CheckoutDetailsPresenter.this.o.error("Failed to pay by GooglePay", bVar.b());
                    CheckoutDetailsPresenter checkoutDetailsPresenter2 = CheckoutDetailsPresenter.this;
                    checkoutDetailsPresenter2.z(d.b.a, checkoutDetailsPresenter2.R1(bVar.a()));
                } else if (e22Var instanceof e22.a) {
                    String a = this.d.a();
                    PaymentDataRequest a2 = ((e22.a) e22Var).a();
                    z41 z41Var = new z41(CheckoutDetailsPresenter.this);
                    pp0 c = this.d.c();
                    z65.f(c, "null cannot be cast to non-null type com.dodopizza.payment.charge.scenario.GooglePayPaymentScenario");
                    ((w41) CheckoutDetailsPresenter.this.getViewState()).Y3(a, a2, z41Var, ((ch4) c).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliverablePlaceCreatedResult$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.C0528a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(a.C0528a c0528a, cv1<? super s> cv1Var) {
            super(2, cv1Var);
            this.d = c0528a;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s sVar = new s(this.d, cv1Var);
            sVar.b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((s) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.u1((b61) this.b, this.d.b().r());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentMethodSelection$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s0(cv1<? super s0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s0 s0Var = new s0(cv1Var);
            s0Var.b = obj;
            return s0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((s0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Le22;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startGooglePayPaymentScenario$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s1 extends f3b implements y84<pz3<? super e22>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s1(cv1<? super s1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super e22> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            s1 s1Var = new s1(cv1Var);
            s1Var.b = th;
            return s1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to create google pay request. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliverablePlaceCreatedResult$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = th;
            return tVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling address selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentMethodSelection$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t0(cv1<? super t0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t0 t0Var = new t0(cv1Var);
            t0Var.b = obj;
            return t0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((t0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startSavedCardPaymentScenario$$inlined$onSuccessType$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t1 extends f3b implements Function2<ts7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ CheckoutDetailsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t1(cv1 cv1Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
            super(2, cv1Var);
            this.c = checkoutDetailsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t1 t1Var = new t1(cv1Var, this.c);
            t1Var.b = obj;
            return t1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ts7 ts7Var, cv1<? super Unit> cv1Var) {
            return ((t1) create(ts7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object obj2 = this.b;
                if (obj2 instanceof ts7.b) {
                    ts7.b bVar = (ts7.b) obj2;
                    qs7 a = bVar.a();
                    if (a instanceof vs7) {
                        this.c.W1();
                    } else if (a instanceof ss7) {
                        this.c.W1();
                    } else if (!(a instanceof rs7)) {
                        Logger logger = this.c.o;
                        logger.warn("Wrong payment state " + bVar);
                    } else {
                        this.c.l.e((rs7) a, this.c);
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliverablePlaceSelection$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((u) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handlePaymentMethodSelection$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u0(cv1<? super u0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            u0 u0Var = new u0(cv1Var);
            u0Var.b = th;
            return u0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling payment method selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startSavedCardPaymentScenario$$inlined$onSuccessType$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u1 extends f3b implements Function2<ts7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ CheckoutDetailsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(cv1 cv1Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
            super(2, cv1Var);
            this.c = checkoutDetailsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u1 u1Var = new u1(cv1Var, this.c);
            u1Var.b = obj;
            return u1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ts7 ts7Var, cv1<? super Unit> cv1Var) {
            return ((u1) create(ts7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object obj2 = this.b;
                if (obj2 instanceof ts7.a) {
                    this.c.o.warn("Failed to charge saved card.");
                    CheckoutDetailsPresenter checkoutDetailsPresenter = this.c;
                    checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1(((ts7.a) obj2).a()));
                    ((w41) this.c.getViewState()).L8();
                    this.c.l1();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliverablePlaceSelection$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v(cv1<? super v> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v vVar = new v(cv1Var);
            vVar.b = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((v) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleRedirectSavedCardChecked$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v0(cv1<? super v0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v0 v0Var = new v0(cv1Var);
            v0Var.b = obj;
            return v0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((v0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lts7;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startSavedCardPaymentScenario$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v1 extends f3b implements y84<pz3<? super ts7>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v1(cv1<? super v1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ts7> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            v1 v1Var = new v1(cv1Var);
            v1Var.b = th;
            return v1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed to charge saved card.", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliverablePlaceSelection$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w(cv1<? super w> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            w wVar = new w(cv1Var);
            wVar.b = th;
            return wVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling address selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleRedirectSavedCardChecked$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w0(cv1<? super w0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w0 w0Var = new w0(cv1Var);
            w0Var.b = obj;
            return w0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((w0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startSberPayPaymentScenario$1", f = "CheckoutDetailsPresenter.kt", l = {859}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ os7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w1(os7 os7Var, cv1<? super w1> cv1Var) {
            super(2, cv1Var);
            this.d = os7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w1 w1Var = new w1(this.d, cv1Var);
            w1Var.b = obj;
            return w1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((w1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            qx1 qx1Var;
            Exception e;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    qx1Var = (qx1) this.b;
                    try {
                        vk9.b(obj);
                    } catch (Exception e2) {
                        e = e2;
                        rx1.f(qx1Var);
                        CheckoutDetailsPresenter.this.o.warn("Failed to initiate SberPay payment", (Throwable) e);
                        CheckoutDetailsPresenter.this.X0();
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                try {
                    CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                    os7 os7Var = this.d;
                    this.b = qx1Var2;
                    this.a = 1;
                    if (checkoutDetailsPresenter.B0(os7Var, this) == d) {
                        return d;
                    }
                } catch (Exception e3) {
                    qx1Var = qx1Var2;
                    e = e3;
                    rx1.f(qx1Var);
                    CheckoutDetailsPresenter.this.o.warn("Failed to initiate SberPay payment", (Throwable) e);
                    CheckoutDetailsPresenter.this.X0();
                    return Unit.a;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliveryLocationDetailsChanged$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x(cv1<? super x> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((x) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleRedirectSavedCardChecked$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x0 extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(boolean z, cv1<? super x0> cv1Var) {
            super(3, cv1Var);
            this.d = z;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            x0 x0Var = new x0(this.d, cv1Var);
            x0Var.b = th;
            return x0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = CheckoutDetailsPresenter.this.o;
                boolean z = this.d;
                logger.warn("Failed to set isRedirectSavedCardChecked parameter with it's value: " + z, (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$startSpbPaymentScenario$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ os7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x1(os7 os7Var, cv1<? super x1> cv1Var) {
            super(2, cv1Var);
            this.d = os7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x1 x1Var = new x1(this.d, cv1Var);
            x1Var.b = obj;
            return x1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((x1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                try {
                    CheckoutDetailsPresenter.this.C0(this.d);
                } catch (Exception e) {
                    rx1.f(qx1Var);
                    CheckoutDetailsPresenter.this.o.warn("Failed to initiate SBP payment", (Throwable) e);
                    CheckoutDetailsPresenter.this.X0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliveryLocationDetailsChanged$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y(cv1<? super y> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y yVar = new y(cv1Var);
            yVar.b = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((y) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleReusablePackageSwitchToggled$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y0(cv1<? super y0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y0 y0Var = new y0(cv1Var);
            y0Var.b = obj;
            return y0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((y0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$switchToDelivery$1", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y1(cv1<? super y1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y1 y1Var = new y1(cv1Var);
            y1Var.b = obj;
            return y1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((y1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.s1((b61) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleDeliveryLocationDetailsChanged$3", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z extends f3b implements y84<pz3<? super b61>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z(cv1<? super z> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            z zVar = new z(cv1Var);
            zVar.b = th;
            return zVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter.this.o.warn("Failed handling address selection. ", (Throwable) this.b);
                CheckoutDetailsPresenter.this.l1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$handleReusablePackageSwitchToggled$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z0(cv1<? super z0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z0 z0Var = new z0(cv1Var);
            z0Var.b = obj;
            return z0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((z0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "details", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$switchToDelivery$2", f = "CheckoutDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z1 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z1(cv1<? super z1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z1 z1Var = new z1(cv1Var);
            z1Var.b = obj;
            return z1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((z1) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckoutDetailsPresenter checkoutDetailsPresenter = CheckoutDetailsPresenter.this;
                checkoutDetailsPresenter.z(d.b.a, checkoutDetailsPresenter.R1((b61) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CheckoutDetailsPresenter(b61 b61Var, i41 i41Var, dt5 dt5Var, f63 f63Var, f63 f63Var2, hq3 hq3Var, ay1 ay1Var, xtb xtbVar, gc gcVar, wt9 wt9Var, s41 s41Var, ih4 ih4Var) {
        z65.h(b61Var, "initialCheckoutState");
        z65.h(i41Var, "interactor");
        z65.h(dt5Var, "currentLocality");
        z65.h(f63Var, "checkoutRouter");
        z65.h(f63Var2, "globalRouter");
        z65.h(hq3Var, "featureService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(xtbVar, "urlOpener");
        z65.h(gcVar, "analytics");
        z65.h(wt9Var, "sberPayFinishDeepLinkBuilder");
        z65.h(s41Var, "router");
        z65.h(ih4Var, "googlePlayServicesHelper");
        this.b = b61Var;
        this.c = i41Var;
        this.d = dt5Var;
        this.e = f63Var;
        this.f = f63Var2;
        this.g = hq3Var;
        this.h = ay1Var;
        this.i = xtbVar;
        this.j = gcVar;
        this.k = wt9Var;
        this.l = s41Var;
        this.m = ih4Var;
        this.n = new g();
        this.o = LoggerFactory.getLogger("CheckoutDetailsPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(defpackage.os7 r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter.b
            if (r0 == 0) goto L13
            r0 = r6
            ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b r0 = (ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b r0 = new ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter r5 = (ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter) r5
            defpackage.vk9.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.vk9.b(r6)
            i41 r6 = r4.c
            r0.a = r4
            r0.d = r3
            java.lang.Object r6 = r6.A(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            tm r6 = (defpackage.tm) r6
            boolean r0 = r6 instanceof defpackage.tm.b
            if (r0 == 0) goto L6f
            gc r0 = r5.j
            ao3 r1 = defpackage.ao3.a
            tm$b r6 = (defpackage.tm.b) r6
            java.lang.String r2 = r6.a()
            ck1 r3 = defpackage.ck1.o
            dc r1 = r1.a(r2, r3)
            r0.a(r1)
            moxy.MvpView r5 = r5.getViewState()
            w41 r5 = (defpackage.w41) r5
            java.lang.String r6 = r6.a()
            r5.Q5(r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L6f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "App2App payment failed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter.A0(os7, cv1):java.lang.Object");
    }

    private final void A1(e91 e91Var, boolean z2, boolean z3) {
        this.l.g(true, e91Var, this.d, z2, z3, this.h, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(defpackage.os7 r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter.c
            if (r0 == 0) goto L13
            r0 = r6
            ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$c r0 = (ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$c r0 = new ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter r5 = (ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter) r5
            defpackage.vk9.b(r6)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.vk9.b(r6)
            wt9 r6 = r4.k
            java.lang.String r2 = r5.e()
            java.lang.String r6 = r6.a(r2)
            i41 r2 = r4.c
            r0.a = r4
            r0.d = r3
            java.lang.Object r6 = r2.w(r5, r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            zt9 r6 = (defpackage.zt9) r6
            boolean r0 = r6 instanceof defpackage.zt9.b
            if (r0 == 0) goto L79
            gc r0 = r5.j
            ao3 r1 = defpackage.ao3.a
            zt9$b r6 = (defpackage.zt9.b) r6
            java.lang.String r2 = r6.a()
            ck1 r3 = defpackage.ck1.o
            dc r1 = r1.a(r2, r3)
            r0.a(r1)
            moxy.MvpView r5 = r5.getViewState()
            w41 r5 = (defpackage.w41) r5
            java.lang.String r6 = r6.a()
            r5.Rb(r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "SberPay payment failed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter.B0(os7, cv1):java.lang.Object");
    }

    private final void B1(e91 e91Var, boolean z2, boolean z3) {
        this.l.g(false, e91Var, this.d, z2, z3, this.h, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(os7 os7Var) {
        uz3 uz3Var = uz3.a;
        o(wz3.h(wz3.F(wz3.F(this.c.z(os7Var), new d(null, this)), new e(null, this)), new f(null)));
    }

    private final void C1(boolean z2, ck1 ck1Var) {
        this.j.a(y6.a.a(ck1Var, true));
        this.l.h(this.d, this.h, z2, this, ck1Var);
    }

    private final void D0(b61 b61Var) {
        pt2 e3 = b61Var.e();
        if (e3 instanceof pt2.c) {
            v1();
        } else if (e3 instanceof pt2.e) {
            w1();
        } else {
            f1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(a.C0528a c0528a) {
        this.l.i(c0528a.b().k().a(), this);
    }

    private final void E0(a.C0528a c0528a) {
        e91 c3 = yk7.c(c0528a.b().k());
        if (c3 == null) {
            C1(c0528a.b().r(), ck1.o);
            return;
        }
        boolean r2 = c0528a.b().r();
        ck1 ck1Var = ck1.o;
        t1(c3, r2, ck1Var);
        this.j.a(y6.a.f(ck1Var, true));
    }

    private final l95 E1(os7 os7Var) {
        l95 d3;
        d3 = sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new p1(os7Var, null), 3, null);
        return d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(boolean z2, String str) {
        G0();
        ej7 ej7Var = new ej7(str, ck1.o, true);
        if (this.m.a() && z2 && this.g.a(bq3.r6)) {
            this.f.e(new h(false, new j(ej7Var)));
        } else {
            this.f.e(new i(false, new k(ej7Var)));
        }
    }

    private final void F1(ap2 ap2Var, b61 b61Var) {
        xtb.a.a(this.i, ap2Var.a(), false, 2, null);
        z(d.b.a, R1(b61Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0() {
        z(d.a.a, a.b.a);
        this.e.c(null);
        this.e.d();
        this.f.l(R.id.checkout_cart_errors, v51.b.a);
        if (this.g.a(bq3.g7)) {
            this.f.c(vo8.a);
        } else {
            this.f.c(fo8.a);
        }
    }

    private final void G1(os7 os7Var, hn6 hn6Var, String str, String str2, String str3) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.p(hn6Var, str, str2, str3), new q1(null)), new r1(os7Var, null)), new s1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> H0(a.C0528a c0528a) {
        jw7.c cVar;
        jw7 a3 = c0528a.b().n().a();
        if (a3 instanceof jw7.c) {
            cVar = (jw7.c) a3;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            this.l.b(this);
            return new bua<>(d.e.a, c0528a);
        }
        return new bua<>(d.b.a, c0528a);
    }

    private final void H1(os7 os7Var, hn6 hn6Var) {
        this.l.a(os7Var, hn6Var, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(a.C0528a c0528a) {
        if (this.g.a(bq3.Z5)) {
            B1(yk7.c(c0528a.b().k()), c0528a.b().r(), c0528a.b().f().c());
        } else {
            E0(c0528a);
        }
    }

    private final void I1(os7 os7Var, in6 in6Var, b61 b61Var) {
        pp0 c3 = os7Var.c();
        if (c3 instanceof j4c) {
            M1((j4c) c3);
        } else if (c3 instanceof lu6) {
            H1(os7Var, in6Var.k());
        } else if (c3 instanceof ch4) {
            ch4 ch4Var = (ch4) c3;
            G1(os7Var, in6Var.k(), ch4Var.c(), ch4Var.b(), ch4Var.d());
        } else if (c3 instanceof au9) {
            K1(os7Var);
        } else if (c3 instanceof um) {
            E1(os7Var);
        } else if (c3 instanceof ht9) {
            J1(os7Var);
        } else if (c3 instanceof ap2) {
            F1((ap2) c3, b61Var);
        } else if (c3 instanceof bv9) {
            L1(os7Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(t51 t51Var, b61 b61Var) {
        s1(N1(b61Var));
        if (t51Var instanceof t51.d) {
            I1(((t51.d) t51Var).a(), b61Var.i(), b61Var);
        } else if (t51Var instanceof t51.e) {
            F0(b61Var.k().b(), ((t51.e) t51Var).a());
        } else if (t51Var instanceof t51.a) {
            z(d.b.a, R1(b61Var));
        } else if (z65.c(t51Var, t51.b.b)) {
            W1();
        }
    }

    private final void J1(os7 os7Var) {
        uz3 uz3Var = uz3.a;
        o(wz3.h(wz3.F(wz3.F(this.c.e(os7Var.a(), os7Var.e()), new t1(null, this)), new u1(null, this)), new v1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> K0(a.C0528a c0528a, hn6 hn6Var) {
        z(d.C0531d.a, c0528a);
        if (!c0528a.b().f().f() && (c0528a.b().n().a() instanceof jw7.c)) {
            hn6Var = c0528a.b().i().k();
        }
        o(wz3.h(uz3.a.b(wz3.F(this.c.s(c0528a.b(), hn6Var), new l(null)), new m(null)), new n(null)));
        return x();
    }

    private final l95 K1(os7 os7Var) {
        l95 d3;
        d3 = sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new w1(os7Var, null), 3, null);
        return d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(Long l2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.d(l2), new o(null)), new p(null)), new q(null)));
    }

    private final l95 L1(os7 os7Var) {
        l95 d3;
        d3 = sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new x1(os7Var, null), 3, null);
        return d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(ou2 ou2Var, a.C0528a c0528a, boolean z2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.v(ou2Var, lk7.a.b, z2), new r(null)), new s(c0528a, null)), new t(null)));
    }

    private final void M1(j4c j4cVar) {
        this.l.l(j4cVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(ou2 ou2Var, boolean z2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.v(ou2Var, lk7.a.c, z2), new u(null)), new v(null)), new w(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b61 N1(b61 b61Var) {
        if (b61Var.c() instanceof u31.i.b) {
            return b61.b(b61Var, null, null, null, null, null, null, null, null, u31.i.a.a, null, null, false, null, 7935, null);
        }
        return b61Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(a.C0528a c0528a) {
        if (this.g.a(bq3.Z5)) {
            B1(yk7.c(c0528a.b().k()), c0528a.b().r(), c0528a.b().f().c());
        } else {
            C1(c0528a.b().r(), ck1.x);
        }
    }

    private final void O1() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.n(), new y1(null)), new z1(null)), new a2(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(e91 e91Var, e91 e91Var2) {
        this.j.a(y6.a.c(ck1.o, true, e91Var, e91Var2));
        o(wz3.h(uz3.a.b(wz3.F(this.c.c(e91Var), new x(null)), new y(null)), new z(null)));
    }

    private final void P1() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.j(), new b2(null)), new c2(null)), new d2(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(a.C0528a c0528a) {
        e91 c3 = yk7.c(c0528a.b().k());
        if (c3 != null) {
            if (this.g.a(bq3.Z5)) {
                A1(c3, c0528a.b().r(), c0528a.b().f().c());
            } else {
                t1(c3, c0528a.b().r(), ck1.x);
            }
        }
        this.j.a(y6.a.f(ck1.x, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        r1();
        P1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(int i2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.g(i2), new a0(null)), new b0(null)), new c0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.C0528a R1(b61 b61Var) {
        return new a.C0528a(b61Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> S0(b.v vVar, a.C0528a c0528a) {
        uz3 uz3Var = uz3.a;
        o(wz3.h(wz3.F(wz3.F(this.c.u(vVar.a(), vVar.b()), new d0(null, this)), new e0(null, this)), new f0(c0528a, null)));
        return x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1() {
        o(wz3.h(this.c.x(), new e2(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(Long l2, String str, boolean z2, a.C0528a c0528a, int i2) {
        this.j.a(dd.f(i2, false));
        U0(l2, str, z2, c0528a, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(a.C0528a c0528a) {
        u31.g gVar;
        u31 c3 = c0528a.b().c();
        if (c3 instanceof u31.g) {
            gVar = (u31.g) c3;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return;
        }
        this.j.a(dd.c(gVar.b(), ck1.o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(Long l2, String str, boolean z2, a.C0528a c0528a, boolean z3) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.r(c0528a.b(), l2, str, z2, z3), new g0(null)), new h0(null)), new i0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(boolean z2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.a(z2), new j0(null)), new k0(null)), new l0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.q(), new m0(null)), new n0(null)), new o0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.i(), new f2(null)), new g2(null)), new h2(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.y(), new p0(null)), new q0(null)), new r0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(jw7 jw7Var, d88 d88Var) {
        this.j.a(v31.a(d88Var, jw7Var.c(), ck1.o));
        o(wz3.h(uz3.a.b(wz3.F(this.c.f(jw7Var), new s0(null)), new t0(null)), new u0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> Z0(a.C0528a c0528a) {
        wk7 k2 = c0528a.b().k();
        if ((k2 instanceof bq0.b) || (k2 instanceof nk9.a)) {
            O1();
            return x();
        }
        l1();
        return x();
    }

    private final void a1(boolean z2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.l(z2), new v0(null)), new w0(null)), new x0(z2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(boolean z2) {
        this.j.a(dd.e(z2));
        a1(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(boolean z2) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.b(z2), new y0(null)), new z0(null)), new a1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(v51 v51Var) {
        this.n.invoke(v51Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1() {
        q1();
        O1();
    }

    private final void f1() {
        ((w41) getViewState()).Zf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> g1() {
        h1();
        ((w41) getViewState()).Wd();
        s1(this.b);
        n1(this.b);
        return new bua<>(d.b.a, new a.C0528a(this.b));
    }

    private final void h1() {
        if (this.g.a(bq3.f5)) {
            ((w41) getViewState()).Tc();
            y1();
            return;
        }
        ((w41) getViewState()).a7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(a.C0528a c0528a) {
        k1(c0528a, new rx6(this.e, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1(a.C0528a c0528a) {
        k1(c0528a, new lt2(this.e, this));
    }

    private final void k1(a.C0528a c0528a, wk9<mt2> wk9Var) {
        this.l.f(c0528a.b().e(), c0528a.b().k().a(), c0528a.b().f().b(), this, wk9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.m(), new c1(null)), new d1(null)), new e1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(j3a j3aVar) {
        o(wz3.h(uz3.a.b(this.c.h(j3aVar.d(), j3aVar.c(), j3aVar.b(), j3aVar.a()), new f1(null)), new g1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(b61 b61Var) {
        sx6.b bVar;
        List<sx6.a> a3;
        sx6 j2 = b61Var.j();
        if (j2 instanceof sx6.b) {
            bVar = (sx6.b) j2;
        } else {
            bVar = null;
        }
        if (bVar != null && (a3 = bVar.a()) != null) {
            Iterator<sx6.a> it = a3.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    sx6.a next = it.next();
                    if ((next instanceof sx6.a.b) && ((sx6.a.b) next).g()) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            ((w41) viewState).f6(valueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(d88 d88Var, lk7.d dVar) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.t(d88Var, dVar), new h1(null)), new i1(null)), new j1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1(d88 d88Var, lk7.d dVar, Boolean bool) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.k(d88Var, dVar, bool), new k1(null)), new l1(null)), new m1(null)));
    }

    private final void q1() {
        if (this.g.a(bq3.d6)) {
            this.j.a(lk7.a.e(ck1.o));
        }
    }

    private final void r1() {
        if (this.g.a(bq3.d6)) {
            this.j.a(lk7.a.f(ck1.o));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(b61 b61Var) {
        if (b61Var.c() instanceof u31.g) {
            this.j.a(dd.d(ck1.o));
        }
        D0(b61Var);
        ((w41) getViewState()).v5(b61Var);
        this.n.invoke(b61Var.d());
    }

    private final void t1(e91 e91Var, boolean z2, ck1 ck1Var) {
        this.l.c(e91Var, this, z2, ck1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(b61 b61Var, boolean z2) {
        e91 c3 = yk7.c(b61Var.k());
        if (c3 != null && c3.d()) {
            t1(c3, z2, ck1.o);
            z(d.e.a, R1(b61Var));
            return;
        }
        z(d.b.a, R1(b61Var));
    }

    private final void v1() {
        ((w41) getViewState()).C8();
        ((w41) getViewState()).k2();
        ((w41) getViewState()).P9();
        ((w41) getViewState()).Mb();
        ((w41) getViewState()).T6();
    }

    private final void w1() {
        ((w41) getViewState()).C8();
        ((w41) getViewState()).jf();
        ((w41) getViewState()).I1();
        ((w41) getViewState()).Df();
        ((w41) getViewState()).O2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(fn3 fn3Var, a.C0528a c0528a) {
        String str;
        d88 a3 = yk7.a(c0528a.b().k());
        if (a3 != null) {
            str = a3.getId();
        } else {
            str = null;
        }
        this.l.j(R.id.select_carryout, fn3Var, this.d, str, this);
    }

    private final void y1() {
        o(wz3.h(wz3.F(this.c.o(), new n1(null)), new o1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(String str) {
        this.l.d(str, this);
    }

    public final void U1() {
        this.j.a(gu9.a.a());
    }

    public final void V1() {
        this.j.a(gu9.a.b());
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.e.j(R.id.secure_3d_authorization_data);
        this.f.l(R.id.checkout_cart_errors, v51.b.a);
        super.onDestroy();
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a> t() {
        return new bua<>(d.c.a, a.b.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<ru.dodopizza.app.presentation.checkout.details.d, ru.dodopizza.app.presentation.checkout.details.a>, Unit> v() {
        return new b1();
    }
}
