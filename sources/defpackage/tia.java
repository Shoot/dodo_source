package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.view.custom.PopupWithTextIconView;
import com.dodopizza.order.feature.prizoteka.presentation.PrizotekaProgressView;
import com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies;
import com.dodopizza.order.feature.shoppingcart.adapter.good.combo.ComboCartProductViewHolder;
import com.dodopizza.order.feature.shoppingcart.adapter.good.pizza.PizzaCartProductViewHolder;
import com.dodopizza.order.feature.shoppingcart.adapter.good.snack.SnackCartProductViewHolder;
import com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.d15;
import defpackage.dy6;
import defpackage.k6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: ShoppingCartFragment.kt */
@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000 Ø\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ù\u0002B\t¢\u0006\u0006\bÖ\u0002\u0010×\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J9\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0096\u0001J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u000bH\u0014J&\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\b\u0010(\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0012H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020+H\u0016J\u0010\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020+H\u0016J\b\u00102\u001a\u00020\rH\u0016J(\u00107\u001a\u00020\r2\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0016J\b\u00108\u001a\u00020\rH\u0016J\u0016\u0010<\u001a\u00020\r2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020\rH\u0016J\b\u0010A\u001a\u00020\rH\u0016J\u0010\u0010D\u001a\u00020\r2\u0006\u0010C\u001a\u00020BH\u0016J\b\u0010E\u001a\u00020\rH\u0016J\b\u0010F\u001a\u00020\rH\u0016J\b\u0010G\u001a\u00020\rH\u0016J\b\u0010H\u001a\u00020\rH\u0016J\u0010\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020IH\u0016J\u0010\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020LH\u0016J\b\u0010O\u001a\u00020\rH\u0016J\b\u0010P\u001a\u00020\rH\u0016J\b\u0010Q\u001a\u00020\rH\u0016J\b\u0010R\u001a\u00020\rH\u0016J\u0010\u0010U\u001a\u00020\r2\u0006\u0010T\u001a\u00020SH\u0016J\u0018\u0010X\u001a\u00020\r2\u0006\u0010V\u001a\u00020+2\u0006\u0010W\u001a\u00020\u000bH\u0016J(\u0010Y\u001a\u00020\r2\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0016J\b\u0010Z\u001a\u00020\rH\u0016J\b\u0010[\u001a\u00020\rH\u0016J\b\u0010\\\u001a\u00020\rH\u0016J\u0010\u0010^\u001a\u00020\r2\u0006\u0010]\u001a\u00020+H\u0016J\b\u0010_\u001a\u00020\rH\u0016J\u0010\u0010a\u001a\u00020\r2\u0006\u0010`\u001a\u00020\u0012H\u0016J\b\u0010b\u001a\u00020\rH\u0016J\b\u0010c\u001a\u00020\rH\u0016J\b\u0010d\u001a\u00020\rH\u0016J\u0010\u0010f\u001a\u00020\r2\u0006\u0010e\u001a\u00020\u0012H\u0016J\b\u0010g\u001a\u00020\rH\u0016J\b\u0010h\u001a\u00020\rH\u0016J\b\u0010i\u001a\u00020\rH\u0016J\b\u0010j\u001a\u00020\rH\u0016J\b\u0010k\u001a\u00020\rH\u0016J(\u0010o\u001a\u00020\r2\u0006\u0010m\u001a\u00020l2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010q\u001a\u00020\r2\u0006\u0010p\u001a\u00020\tH\u0016J\b\u0010r\u001a\u00020\rH\u0016J\b\u0010s\u001a\u00020\rH\u0016J\b\u0010t\u001a\u00020\rH\u0016J\b\u0010u\u001a\u00020\rH\u0016J\b\u0010v\u001a\u00020\rH\u0016J\b\u0010w\u001a\u00020\rH\u0016J\b\u0010x\u001a\u00020\rH\u0016J\u0016\u0010{\u001a\u00020\r2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020y09H\u0016R&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u0092\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R!\u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u008f\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R!\u0010\u009c\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u008f\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R!\u0010¡\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u008f\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¤\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u008f\u0001\u001a\u0006\b£\u0001\u0010 \u0001R!\u0010§\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u008f\u0001\u001a\u0006\b¦\u0001\u0010 \u0001R!\u0010¬\u0001\u001a\u00030¨\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0001\u0010\u008f\u0001\u001a\u0006\bª\u0001\u0010«\u0001R \u0010°\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u008f\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R \u0010³\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010\u008f\u0001\u001a\u0006\b²\u0001\u0010¯\u0001R!\u0010¸\u0001\u001a\u00030´\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u008f\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R!\u0010»\u0001\u001a\u00030´\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u008f\u0001\u001a\u0006\bº\u0001\u0010·\u0001R!\u0010À\u0001\u001a\u00030¼\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010\u008f\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u008f\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R!\u0010È\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u008f\u0001\u001a\u0006\bÇ\u0001\u0010 \u0001R!\u0010Í\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u008f\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R!\u0010Ð\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u008f\u0001\u001a\u0006\bÏ\u0001\u0010 \u0001R!\u0010Ó\u0001\u001a\u00030Á\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÑ\u0001\u0010\u008f\u0001\u001a\u0006\bÒ\u0001\u0010Ä\u0001R!\u0010Ö\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u008f\u0001\u001a\u0006\bÕ\u0001\u0010 \u0001R!\u0010Ù\u0001\u001a\u00030¼\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0001\u0010\u008f\u0001\u001a\u0006\bØ\u0001\u0010¿\u0001R!\u0010Ü\u0001\u001a\u00030Á\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÚ\u0001\u0010\u008f\u0001\u001a\u0006\bÛ\u0001\u0010Ä\u0001R!\u0010ß\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010\u008f\u0001\u001a\u0006\bÞ\u0001\u0010 \u0001R!\u0010â\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bà\u0001\u0010\u008f\u0001\u001a\u0006\bá\u0001\u0010 \u0001R!\u0010å\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bã\u0001\u0010\u008f\u0001\u001a\u0006\bä\u0001\u0010 \u0001R!\u0010è\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bæ\u0001\u0010\u008f\u0001\u001a\u0006\bç\u0001\u0010 \u0001R!\u0010ë\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010\u008f\u0001\u001a\u0006\bê\u0001\u0010 \u0001R!\u0010î\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bì\u0001\u0010\u008f\u0001\u001a\u0006\bí\u0001\u0010 \u0001R!\u0010ñ\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bï\u0001\u0010\u008f\u0001\u001a\u0006\bð\u0001\u0010 \u0001R\u001f\u0010ô\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bf\u0010\u008f\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R \u0010ö\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bc\u0010\u008f\u0001\u001a\u0006\bõ\u0001\u0010 \u0001R!\u0010û\u0001\u001a\u00030÷\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bø\u0001\u0010\u008f\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R \u0010þ\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0001\u0010\u008f\u0001\u001a\u0006\bý\u0001\u0010ó\u0001R \u0010\u0081\u0002\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÿ\u0001\u0010\u008f\u0001\u001a\u0006\b\u0080\u0002\u0010ó\u0001R!\u0010\u0084\u0002\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010\u008f\u0001\u001a\u0006\b\u0083\u0002\u0010 \u0001R!\u0010\u0087\u0002\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u008f\u0001\u001a\u0006\b\u0086\u0002\u0010 \u0001R!\u0010\u008a\u0002\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u008f\u0001\u001a\u0006\b\u0089\u0002\u0010 \u0001R!\u0010\u008f\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010\u008f\u0001\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R!\u0010\u0094\u0002\u001a\u00030\u0090\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u008f\u0001\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R!\u0010\u0097\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010\u008f\u0001\u001a\u0006\b\u0096\u0002\u0010\u008e\u0002R!\u0010\u009a\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010\u008f\u0001\u001a\u0006\b\u0099\u0002\u0010\u008e\u0002R!\u0010\u009d\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0002\u0010\u008f\u0001\u001a\u0006\b\u009c\u0002\u0010\u008e\u0002R \u0010 \u0002\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u008f\u0001\u001a\u0006\b\u009f\u0002\u0010ó\u0001R \u0010£\u0002\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0002\u0010\u008f\u0001\u001a\u0006\b¢\u0002\u0010ó\u0001R!\u0010¦\u0002\u001a\u00030÷\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0002\u0010\u008f\u0001\u001a\u0006\b¥\u0002\u0010ú\u0001R!\u0010©\u0002\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0002\u0010\u008f\u0001\u001a\u0006\b¨\u0002\u0010 \u0001R \u0010¬\u0002\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0002\u0010\u008f\u0001\u001a\u0006\b«\u0002\u0010ó\u0001R \u0010¯\u0002\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010\u008f\u0001\u001a\u0006\b®\u0002\u0010¯\u0001R*\u0010·\u0002\u001a\u00030°\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0002\u0010²\u0002\u001a\u0006\b³\u0002\u0010´\u0002\"\u0006\bµ\u0002\u0010¶\u0002R*\u0010¿\u0002\u001a\u00030¸\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0002\u0010º\u0002\u001a\u0006\b»\u0002\u0010¼\u0002\"\u0006\b½\u0002\u0010¾\u0002R*\u0010Ç\u0002\u001a\u00030À\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002\"\u0006\bÅ\u0002\u0010Æ\u0002R*\u0010Ï\u0002\u001a\u00030È\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÉ\u0002\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002\"\u0006\bÍ\u0002\u0010Î\u0002R+\u0010Õ\u0002\u001a\r Ð\u0002*\u0005\u0018\u00010\u0085\u00010\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÑ\u0002\u0010Ò\u0002\u001a\u0006\bÓ\u0002\u0010Ô\u0002¨\u0006Ú\u0002"}, d2 = {"Ltia;", "Lf70;", "Loja;", "Ld15;", "Landroid/view/View;", "layout", "Landroid/view/ViewStub;", "wi", "vi", "", "message", "", "textLines", "", "Ci", "zi", "levelIndex", "Ei", "", "show", "Bi", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "storyId", "Lkotlin/Function0;", "onSuccess", "onFailure", "bf", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "ui", "hh", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "view", "onViewCreated", "ff", "visible", "w1", "Lhn6;", "total", "L0", "priceBelowMinDeliveryPrice", "dg", "minDeliveryPrice", "R3", "e4", "previousPrice", "price", "highlightEndColor", "textTemplateStringId", "ld", "n0", "", "Lor0;", "productVOs", "Wb", "Llja;", "shoppingCartVO", "P6", "B5", "r5", "", "rewardSum", "oe", "v1", "Z2", "showProgressBar", "se", "Lop8;", "promoCode", "J6", "Lw18;", "promoAction", "Z6", "xc", "S", "o0", "Lf", "Lce0;", "discountInfo", "T1", "minDeliveryCost", "textTemplateResId", "Yg", "X2", "Je", "J", "Da", "deliveryFee", "e3", "yd", "alwaysFreeDelivery", "i4", "kc", "T4", "R8", "containsGoods", "S4", "G5", "xg", "h8", "Eb", "C6", "Llk8;", "prizotekaVO", "progressDescription", "z8", "infoStoryId", "F", "s1", "da", "Id", "Td", "Va", "L6", "O9", "Llq3;", "levels", "He", "Lcq0;", DateTokenConverter.CONVERTER_KEY, "Lcq0;", "xh", "()Lcq0;", "setCartButtonPosition", "(Lcq0;)V", "cartButtonPosition", "Las8;", "Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter;", com.huawei.hms.push.e.a, "Las8;", "Xh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Landroidx/appcompat/widget/Toolbar;", "f", "Lk79;", "ri", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/ViewSwitcher;", "g", "Ah", "()Landroid/widget/ViewSwitcher;", "contentSwitcher", "Landroidx/core/widget/NestedScrollView;", Image.TYPE_HIGH, "li", "()Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroid/widget/TextView;", "i", "ni", "()Landroid/widget/TextView;", "summaryTitle", "j", "Rh", "minDeliveryTitle", "k", "zh", "cartWarning", "Landroidx/recyclerview/widget/RecyclerView;", "l", "yh", "()Landroidx/recyclerview/widget/RecyclerView;", "cartProducts", Image.TYPE_MEDIUM, "wh", "()Landroid/view/ViewGroup;", "buttonsContainer", "n", "vh", "bottomPanel", "Lcom/dodopizza/android/buttons/DodoButton;", "o", "Vh", "()Lcom/dodopizza/android/buttons/DodoButton;", "placeOrderBtn", "p", "Nh", "minDeliveryPriceButton", "Landroid/widget/RelativeLayout;", "q", "Ih", "()Landroid/widget/RelativeLayout;", "errorMessage", "Landroid/widget/Button;", "r", "ii", "()Landroid/widget/Button;", "refreshButton", Image.TYPE_SMALL, "Qh", "minDeliveryPriceView", "Landroid/widget/FrameLayout;", "t", "Uh", "()Landroid/widget/FrameLayout;", "personalizationFeatureContainer", "u", "Ph", "minDeliveryPriceGoodsLabel", "v", "Sh", "openMenuButton", "w", "Hh", "enterPromoCodeButton", "x", "hi", "promoCodeContainer", "y", "ji", "resetPromoCode", "z", "uh", "activePromocodeText", "A", "qi", "titlePromocodeText", "B", "Fh", "descriptionPromocodeText", "I", "ti", "wrongConditionsLabel", "X", "ki", "saucesLabel", "Y", "mi", "summarySaucesCost", "Z", "Gh", "discountAmount", "Kh", "()Landroid/view/View;", "loyaltyRewardSector", "Lh", "loyaltyRewardSum", "Lcom/dodopizza/android/view/custom/PopupWithTextIconView;", "U4", "Jh", "()Lcom/dodopizza/android/view/custom/PopupWithTextIconView;", "loyaltyRewardInfo", "V4", "Mh", "loyaltyRewardTitle", "W4", "gi", "prizotekaView", "X4", "fi", "prizotekaTitle", "Y4", "ai", "prizotekaProgressDescription", "Z4", "di", "prizotekaSubtitle", "Landroid/widget/ImageView;", "a5", "Zh", "()Landroid/widget/ImageView;", "prizotekaInfo", "Lcom/dodopizza/order/feature/prizoteka/presentation/PrizotekaProgressView;", "b5", "bi", "()Lcom/dodopizza/order/feature/prizoteka/presentation/PrizotekaProgressView;", "prizotekaProgressView", "c5", "Yh", "prizotekaFirstGiftView", "d5", "ci", "prizotekaSecondGiftView", "e5", "ei", "prizotekaThirdGiftView", "f5", "Dh", "deliveryFeeSector", "g5", "Eh", "deliveryFeeTitle", "h5", "Ch", "deliveryFeeInfo", "i5", "Bh", "deliveryFeeAmount", "j5", "Th", "personalOfferContainer", "k5", "si", "upsaleBlockFragmentContainer", "Lxab;", "l5", "Lxab;", "Oh", "()Lxab;", "yi", "(Lxab;)V", "minDeliveryPriceChanger", "Lu18;", "m5", "Lu18;", "pi", "()Lu18;", "setTimerFormatter", "(Lu18;)V", "timerFormatter", "Lf5b;", "n5", "Lf5b;", "oi", "()Lf5b;", "setSystemTimeProvider", "(Lf5b;)V", "systemTimeProvider", "Lg78;", "o5", "Lg78;", "getPizzaDoughNameFormatter", "()Lg78;", "setPizzaDoughNameFormatter", "(Lg78;)V", "pizzaDoughNameFormatter", "kotlin.jvm.PlatformType", "p5", "Lmoxy/ktx/MoxyKtxDelegate;", "Wh", "()Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter;", "presenter", "<init>", "()V", "q5", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tia  reason: default package */
/* loaded from: classes2.dex */
public class tia extends f70 implements oja, d15 {
    public cq0 d;
    public as8<ShoppingCartPresenter> e;
    public xab l5;
    public u18 m5;
    public f5b n5;
    public g78 o5;
    private final MoxyKtxDelegate p5;
    static final /* synthetic */ je5<Object>[] r5 = {bc9.f(new ar8(tia.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(tia.class, "contentSwitcher", "getContentSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(tia.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(tia.class, "summaryTitle", "getSummaryTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "minDeliveryTitle", "getMinDeliveryTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "cartWarning", "getCartWarning()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "cartProducts", "getCartProducts()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(tia.class, "buttonsContainer", "getButtonsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(tia.class, "bottomPanel", "getBottomPanel()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(tia.class, "placeOrderBtn", "getPlaceOrderBtn()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(tia.class, "minDeliveryPriceButton", "getMinDeliveryPriceButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(tia.class, "errorMessage", "getErrorMessage()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(tia.class, "refreshButton", "getRefreshButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(tia.class, "minDeliveryPriceView", "getMinDeliveryPriceView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "personalizationFeatureContainer", "getPersonalizationFeatureContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(tia.class, "minDeliveryPriceGoodsLabel", "getMinDeliveryPriceGoodsLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "openMenuButton", "getOpenMenuButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(tia.class, "enterPromoCodeButton", "getEnterPromoCodeButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "promoCodeContainer", "getPromoCodeContainer()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(tia.class, "resetPromoCode", "getResetPromoCode()Landroid/widget/Button;", 0)), bc9.f(new ar8(tia.class, "activePromocodeText", "getActivePromocodeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "titlePromocodeText", "getTitlePromocodeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "descriptionPromocodeText", "getDescriptionPromocodeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "wrongConditionsLabel", "getWrongConditionsLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "saucesLabel", "getSaucesLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "summarySaucesCost", "getSummarySaucesCost()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "discountAmount", "getDiscountAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "loyaltyRewardSector", "getLoyaltyRewardSector()Landroid/view/View;", 0)), bc9.f(new ar8(tia.class, "loyaltyRewardSum", "getLoyaltyRewardSum()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "loyaltyRewardInfo", "getLoyaltyRewardInfo()Lcom/dodopizza/android/view/custom/PopupWithTextIconView;", 0)), bc9.f(new ar8(tia.class, "loyaltyRewardTitle", "getLoyaltyRewardTitle()Landroid/view/View;", 0)), bc9.f(new ar8(tia.class, "prizotekaView", "getPrizotekaView()Landroid/view/View;", 0)), bc9.f(new ar8(tia.class, "prizotekaTitle", "getPrizotekaTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "prizotekaProgressDescription", "getPrizotekaProgressDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "prizotekaSubtitle", "getPrizotekaSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "prizotekaInfo", "getPrizotekaInfo()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(tia.class, "prizotekaProgressView", "getPrizotekaProgressView()Lcom/dodopizza/order/feature/prizoteka/presentation/PrizotekaProgressView;", 0)), bc9.f(new ar8(tia.class, "prizotekaFirstGiftView", "getPrizotekaFirstGiftView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(tia.class, "prizotekaSecondGiftView", "getPrizotekaSecondGiftView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(tia.class, "prizotekaThirdGiftView", "getPrizotekaThirdGiftView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(tia.class, "deliveryFeeSector", "getDeliveryFeeSector()Landroid/view/View;", 0)), bc9.f(new ar8(tia.class, "deliveryFeeTitle", "getDeliveryFeeTitle()Landroid/view/View;", 0)), bc9.f(new ar8(tia.class, "deliveryFeeInfo", "getDeliveryFeeInfo()Lcom/dodopizza/android/view/custom/PopupWithTextIconView;", 0)), bc9.f(new ar8(tia.class, "deliveryFeeAmount", "getDeliveryFeeAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tia.class, "personalOfferContainer", "getPersonalOfferContainer()Landroid/view/View;", 0)), bc9.f(new ar8(tia.class, "upsaleBlockFragmentContainer", "getUpsaleBlockFragmentContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(tia.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter;", 0))};
    public static final a q5 = new a(null);
    public static final int s5 = 8;
    private final /* synthetic */ e15 c = new e15();
    private final k79 f = kb0.e(this, gy8.shopping_cart_toolbar);
    private final k79 g = kb0.e(this, gy8.shopping_cart_content_switcher);
    private final k79 h = kb0.e(this, gy8.shopping_cart_parent_scroll_view);
    private final k79 i = kb0.e(this, gy8.shopping_cart_summary_title);
    private final k79 j = kb0.e(this, gy8.shopping_cart_min_delivery_title);
    private final k79 k = kb0.e(this, gy8.shopping_cart_warning);
    private final k79 l = kb0.e(this, gy8.shopping_cart_recycler_view);
    private final k79 m = kb0.e(this, gy8.buttons_container);
    private final k79 n = kb0.e(this, gy8.bottom_panel);
    private final k79 o = kb0.e(this, gy8.shopping_cart_place_an_order_button);
    private final k79 p = kb0.e(this, gy8.shopping_cart_min_delivery_price_button);
    private final k79 q = kb0.e(this, gy8.shopping_cart_alert_message);
    private final k79 r = kb0.e(this, gy8.x3);
    private final k79 s = kb0.e(this, gy8.empty_shopping_cart_minimal_price);
    private final k79 t = kb0.e(this, gy8.personalization_feature_container);
    private final k79 u = kb0.e(this, gy8.min_delivery_price_goods_label);
    private final k79 v = kb0.e(this, gy8.empty_shopping_cart_open_menu);
    private final k79 w = kb0.e(this, gy8.enter_promocode_button);
    private final k79 x = kb0.e(this, gy8.info_promocode_container);
    private final k79 y = kb0.e(this, gy8.reset_promocode_button);
    private final k79 z = kb0.e(this, gy8.active_promocode_text);
    private final k79 A = kb0.e(this, gy8.title_promo);
    private final k79 B = kb0.e(this, gy8.description_promo);
    private final k79 I = kb0.e(this, gy8.wrong_conditions);
    private final k79 X = kb0.e(this, gy8.sauces_total_amount_title);
    private final k79 Y = kb0.e(this, gy8.summary_sauces_cost);
    private final k79 Z = kb0.e(this, gy8.discount_amount);
    private final k79 S4 = kb0.e(this, gy8.shopping_cart_loyalty_reward_sector);
    private final k79 T4 = kb0.e(this, gy8.shopping_cart_loyalty_reward_sum);
    private final k79 U4 = kb0.e(this, gy8.shopping_cart_loyalty_reward_info);
    private final k79 V4 = kb0.e(this, gy8.shopping_cart_loyalty_reward_title);
    private final k79 W4 = kb0.e(this, gy8.prizoteka_view);
    private final k79 X4 = kb0.e(this, gy8.prizoteka_title);
    private final k79 Y4 = kb0.e(this, gy8.prizoteka_progress_description);
    private final k79 Z4 = kb0.e(this, gy8.prizoteka_subtitle);
    private final k79 a5 = kb0.e(this, gy8.prizoteka_info);
    private final k79 b5 = kb0.e(this, gy8.prizotek_progress_view);
    private final k79 c5 = kb0.e(this, gy8.first_gift_image);
    private final k79 d5 = kb0.e(this, gy8.second_gift_image);
    private final k79 e5 = kb0.e(this, gy8.third_gift_image);
    private final k79 f5 = kb0.e(this, gy8.summary_delivery_fee_sector);
    private final k79 g5 = kb0.e(this, gy8.delivery_fee_title);
    private final k79 h5 = kb0.e(this, gy8.delivery_fee_info);
    private final k79 i5 = kb0.e(this, gy8.V);
    private final k79 j5 = kb0.e(this, gy8.personal_offers_fragment_container);
    private final k79 k5 = kb0.e(this, gy8.upsale_fragment_container);

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Ltia$a;", "", "Ltia;", "a", "", "ALPHA_0_3", "F", "ALPHA_1_0", "", "DEFAULT_SNACKBAR_TEXT_LINE_COUNT", "I", "PRIZOTEKA_DEFAULT_LEVEL", "PRIZOTEKA_FIRST_LEVEL", "PRIZOTEKA_SECOND_LEVEL", "PRIZOTEKA_THIRD_LEVEL", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tia$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tia a() {
            return new tia();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$a0 */
    /* loaded from: classes2.dex */
    public static final class a0 extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ View b;
        final /* synthetic */ int c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingCartFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: tia$a0$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<String> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return this.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingCartFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: tia$a0$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<View> {
            final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View findViewById = this.a.findViewById(gy8.s5);
                z65.g(findViewById, "findViewById(...)");
                return findViewById;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingCartFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: tia$a0$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingCartFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: tia$a0$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(int i) {
                super(0);
                this.a = i;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, View view, int i) {
            super(1);
            this.a = str;
            this.b = view;
            this.c = i;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.h(new a(this.a));
            uoaVar.e(new b(this.b));
            uoaVar.d(c.a);
            uoaVar.f(new d(this.c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[cq0.values().length];
            try {
                iArr[cq0.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cq0.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tia$b0 */
    /* loaded from: classes2.dex */
    public static final class b0 implements View.OnLayoutChangeListener {
        public b0() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            z65.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            tia.this.li().scrollTo(0, 0);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().o0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Spannable;", "it", "", "a", "(Landroid/text/Spannable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$c0 */
    /* loaded from: classes2.dex */
    static final class c0 extends ej5 implements Function1<Spannable, Unit> {
        c0() {
            super(1);
        }

        public final void a(Spannable spannable) {
            z65.h(spannable, "it");
            tia.this.Rh().setText(spannable);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Spannable spannable) {
            a(spannable);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().u0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$d0 */
    /* loaded from: classes2.dex */
    static final class d0 extends ej5 implements Function0<String> {
        d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return tia.this.Rh().getText().toString();
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().t0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(D)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$e0 */
    /* loaded from: classes2.dex */
    static final class e0 extends ej5 implements Function1<Double, String> {
        final /* synthetic */ hn6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(hn6 hn6Var) {
            super(1);
            this.a = hn6Var;
        }

        public final String a(double d) {
            return un6.c(new hn6(d, this.a.c()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Double d) {
            return a(d.doubleValue());
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().m0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$f0 */
    /* loaded from: classes2.dex */
    static final class f0 extends ej5 implements Function1<String, String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(int i) {
            super(1);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String str) {
            z65.h(str, "it");
            String string = tia.this.getString(this.b, str);
            z65.g(string, "getString(...)");
            return string;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().n0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$g0 */
    /* loaded from: classes2.dex */
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
            tia.this.Wh().v0();
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function1<View, Unit> {
        h() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().q0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "upsaleProductId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$h0 */
    /* loaded from: classes2.dex */
    static final class h0 extends ej5 implements Function1<String, Unit> {
        h0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ShoppingCartPresenter Wh = tia.this.Wh();
            if (str == null) {
                str = "";
            }
            Wh.O(str);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Wh().r0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$i0 */
    /* loaded from: classes2.dex */
    public static final class i0 extends ej5 implements Function1<Object, Boolean> {
        public static final i0 a = new i0();

        public i0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof o4c);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Ch().performClick();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$j0 */
    /* loaded from: classes2.dex */
    public static final class j0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final j0 a = new j0();

        public j0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PizzaCartProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$k */
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function0<ShoppingCartPresenter> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ShoppingCartPresenter invoke() {
            return tia.this.Xh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$k0 */
    /* loaded from: classes2.dex */
    public static final class k0 extends ej5 implements Function1<Object, Boolean> {
        public static final k0 a = new k0();

        public k0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof jl4);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function0<Unit> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.w1(false);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$l0 */
    /* loaded from: classes2.dex */
    public static final class l0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final l0 a = new l0();

        public l0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PizzaCartProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$m */
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function0<Unit> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.w1(false);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$m0 */
    /* loaded from: classes2.dex */
    public static final class m0 extends ej5 implements Function1<Object, Boolean> {
        public static final m0 a = new m0();

        public m0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof vg1);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Spannable;", "it", "", "a", "(Landroid/text/Spannable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$n */
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function1<Spannable, Unit> {
        n() {
            super(1);
        }

        public final void a(Spannable spannable) {
            z65.h(spannable, "it");
            tia.this.Qh().setText(spannable);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Spannable spannable) {
            a(spannable);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$n0 */
    /* loaded from: classes2.dex */
    public static final class n0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final n0 a = new n0();

        public n0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = ComboCartProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$o */
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function0<String> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return tia.this.Qh().getText().toString();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$o0 */
    /* loaded from: classes2.dex */
    public static final class o0 extends ej5 implements Function1<Object, Boolean> {
        public static final o0 a = new o0();

        public o0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof eoa);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(D)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$p */
    /* loaded from: classes2.dex */
    static final class p extends ej5 implements Function1<Double, String> {
        final /* synthetic */ hn6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(hn6 hn6Var) {
            super(1);
            this.a = hn6Var;
        }

        public final String a(double d) {
            return un6.c(new hn6(d, this.a.c()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Double d) {
            return a(d.doubleValue());
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$p0 */
    /* loaded from: classes2.dex */
    public static final class p0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final p0 a = new p0();

        public p0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = SnackCartProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$q */
    /* loaded from: classes2.dex */
    static final class q extends ej5 implements Function1<String, String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i) {
            super(1);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String str) {
            z65.h(str, "it");
            String string = tia.this.getString(this.b, str);
            z65.g(string, "getString(...)");
            return string;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "cartItem", "", "a", "(Lnq0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$q0 */
    /* loaded from: classes2.dex */
    static final class q0 extends ej5 implements Function1<nq0, Unit> {
        q0() {
            super(1);
        }

        public final void a(nq0 nq0Var) {
            z65.h(nq0Var, "cartItem");
            tia.this.Wh().l0(nq0Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nq0 nq0Var) {
            a(nq0Var);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$r */
    /* loaded from: classes2.dex */
    static final class r extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ Pair<hn6, hn6> a;
        final /* synthetic */ tia b;
        final /* synthetic */ List<lq3> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingCartFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: tia$r$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ tia a;
            final /* synthetic */ List<lq3> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(tia tiaVar, List<lq3> list) {
                super(0);
                this.a = tiaVar;
                this.b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.Wh().J0(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(Pair<hn6, hn6> pair, tia tiaVar, List<lq3> list) {
            super(2);
            this.a = pair;
            this.b = tiaVar;
            this.c = list;
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(1613635587, i, -1, "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartFragment.showDynamicDeliveryInfoInEmptyCart.<anonymous>.<anonymous> (ShoppingCartFragment.kt:790)");
            }
            u93.a(androidx.compose.foundation.layout.d.b(sm6.a, 0.0f, 1, null), this.a, new a(this.b, this.c), qn1Var, 70, 0);
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv23;", "discount", "", "a", "(Lv23;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$r0 */
    /* loaded from: classes2.dex */
    static final class r0 extends ej5 implements Function1<v23, Unit> {
        r0() {
            super(1);
        }

        public final void a(v23 v23Var) {
            z65.h(v23Var, "discount");
            tia.this.Wh().p0(v23Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v23 v23Var) {
            a(v23Var);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$s */
    /* loaded from: classes2.dex */
    static final class s extends ej5 implements Function0<Unit> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.Wh().v0();
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "cartItem", "", "a", "(Lnq0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$s0 */
    /* loaded from: classes2.dex */
    static final class s0 extends ej5 implements Function1<nq0, Unit> {
        s0() {
            super(1);
        }

        public final void a(nq0 nq0Var) {
            z65.h(nq0Var, "cartItem");
            tia.this.Wh().x0(nq0Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nq0 nq0Var) {
            a(nq0Var);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "upsaleProductId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$t */
    /* loaded from: classes2.dex */
    static final class t extends ej5 implements Function1<String, Unit> {
        t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ShoppingCartPresenter Wh = tia.this.Wh();
            if (str == null) {
                str = "";
            }
            Wh.O(str);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$t0 */
    /* loaded from: classes2.dex */
    static final class t0 extends ej5 implements Function0<Unit> {
        t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.Wh().V0();
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$u */
    /* loaded from: classes2.dex */
    static final class u extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.Wh().A0(this.b);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "cartItem", "", "a", "(Lnq0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$u0 */
    /* loaded from: classes2.dex */
    static final class u0 extends ej5 implements Function1<nq0, Unit> {
        u0() {
            super(1);
        }

        public final void a(nq0 nq0Var) {
            z65.h(nq0Var, "cartItem");
            tia.this.Wh().N(nq0Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nq0 nq0Var) {
            a(nq0Var);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$v */
    /* loaded from: classes2.dex */
    static final class v extends ej5 implements Function1<View, Unit> {
        v() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            tia.this.Jh().performClick();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "cartItem", "", "a", "(Lnq0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tia$v0 */
    /* loaded from: classes2.dex */
    static final class v0 extends ej5 implements Function1<nq0, Unit> {
        v0() {
            super(1);
        }

        public final void a(nq0 nq0Var) {
            z65.h(nq0Var, "cartItem");
            tia.this.Wh().w0(nq0Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nq0 nq0Var) {
            a(nq0Var);
            return Unit.a;
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$w */
    /* loaded from: classes2.dex */
    static final class w extends ej5 implements Function0<Unit> {
        final /* synthetic */ dy6 a;
        final /* synthetic */ tia b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(dy6 dy6Var, tia tiaVar) {
            super(0);
            this.a = dy6Var;
            this.b = tiaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.dismiss();
            ShoppingCartPresenter Wh = this.b.Wh();
            String string = this.b.getString(r09.nice_bonus_more_about_promotion);
            z65.g(string, "getString(...)");
            Wh.s0(string);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$x */
    /* loaded from: classes2.dex */
    static final class x extends ej5 implements Function0<Unit> {
        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.w1(false);
        }
    }

    /* compiled from: ShoppingCartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tia$y */
    /* loaded from: classes2.dex */
    static final class y extends ej5 implements Function0<Unit> {
        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tia.this.w1(false);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tia$z */
    /* loaded from: classes2.dex */
    public static final class z implements View.OnLayoutChangeListener {
        public z() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            z65.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            tia.this.li().o(130);
        }
    }

    public tia() {
        k kVar = new k();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.p5 = new MoxyKtxDelegate(mvpDelegate, ShoppingCartPresenter.class.getName() + ".presenter", kVar);
    }

    private final ViewSwitcher Ah() {
        return (ViewSwitcher) this.g.a(this, r5[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ai(tia tiaVar, String str, Bundle bundle) {
        z65.h(tiaVar, "this$0");
        z65.h(str, "<anonymous parameter 0>");
        z65.h(bundle, "bundle");
        tiaVar.Wh().h0(bundle.getBoolean("VISIBILITY", true));
    }

    private final TextView Bh() {
        return (TextView) this.i5.a(this, r5[43]);
    }

    private final void Bi(boolean z2) {
        Drawable e2;
        Toolbar ri = ri();
        Drawable drawable = null;
        if (z2 && (e2 = iu1.e(ri().getContext(), bx8.y)) != null) {
            e2.setTint(iu1.c(ri().getContext(), ew8.A));
            drawable = e2;
        }
        ri.setNavigationIcon(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PopupWithTextIconView Ch() {
        return (PopupWithTextIconView) this.h5.a(this, r5[42]);
    }

    private final void Ci(String str, int i2) {
        View view = getView();
        if (view != null) {
            soa.a.a(new a0(str, view, i2)).U();
        }
    }

    private final View Dh() {
        return (View) this.f5.a(this, r5[40]);
    }

    static /* synthetic */ void Di(tia tiaVar, String str, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 2;
            }
            tiaVar.Ci(str, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbar");
    }

    private final View Eh() {
        return (View) this.g5.a(this, r5[41]);
    }

    private final void Ei(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Yh().setAlpha(0.3f);
                        ci().setAlpha(0.3f);
                        ei().setAlpha(1.0f);
                        return;
                    }
                    return;
                }
                Yh().setAlpha(0.3f);
                ci().setAlpha(1.0f);
                ei().setAlpha(0.3f);
                return;
            }
            Yh().setAlpha(1.0f);
            ci().setAlpha(0.3f);
            ei().setAlpha(0.3f);
            return;
        }
        Yh().setAlpha(0.3f);
        ci().setAlpha(0.3f);
        ei().setAlpha(0.3f);
    }

    private final TextView Fh() {
        return (TextView) this.B.a(this, r5[22]);
    }

    private final TextView Gh() {
        return (TextView) this.Z.a(this, r5[26]);
    }

    private final TextView Hh() {
        return (TextView) this.w.a(this, r5[17]);
    }

    private final RelativeLayout Ih() {
        return (RelativeLayout) this.q.a(this, r5[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PopupWithTextIconView Jh() {
        return (PopupWithTextIconView) this.U4.a(this, r5[29]);
    }

    private final View Kh() {
        return (View) this.S4.a(this, r5[27]);
    }

    private final TextView Lh() {
        return (TextView) this.T4.a(this, r5[28]);
    }

    private final View Mh() {
        return (View) this.V4.a(this, r5[30]);
    }

    private final DodoButton Nh() {
        return (DodoButton) this.p.a(this, r5[10]);
    }

    private final TextView Ph() {
        return (TextView) this.u.a(this, r5[15]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView Qh() {
        return (TextView) this.s.a(this, r5[13]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView Rh() {
        return (TextView) this.j.a(this, r5[4]);
    }

    private final Button Sh() {
        return (Button) this.v.a(this, r5[16]);
    }

    private final View Th() {
        return (View) this.j5.a(this, r5[44]);
    }

    private final FrameLayout Uh() {
        return (FrameLayout) this.t.a(this, r5[14]);
    }

    private final DodoButton Vh() {
        return (DodoButton) this.o.a(this, r5[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShoppingCartPresenter Wh() {
        return (ShoppingCartPresenter) this.p5.getValue(this, r5[46]);
    }

    private final ImageView Yh() {
        return (ImageView) this.c5.a(this, r5[37]);
    }

    private final ImageView Zh() {
        return (ImageView) this.a5.a(this, r5[35]);
    }

    private final TextView ai() {
        return (TextView) this.Y4.a(this, r5[33]);
    }

    private final PrizotekaProgressView bi() {
        return (PrizotekaProgressView) this.b5.a(this, r5[36]);
    }

    private final ImageView ci() {
        return (ImageView) this.d5.a(this, r5[38]);
    }

    private final TextView di() {
        return (TextView) this.Z4.a(this, r5[34]);
    }

    private final ImageView ei() {
        return (ImageView) this.e5.a(this, r5[39]);
    }

    private final TextView fi() {
        return (TextView) this.X4.a(this, r5[32]);
    }

    private final View gi() {
        return (View) this.W4.a(this, r5[31]);
    }

    private final RelativeLayout hi() {
        return (RelativeLayout) this.x.a(this, r5[18]);
    }

    private final Button ii() {
        return (Button) this.r.a(this, r5[12]);
    }

    private final Button ji() {
        return (Button) this.y.a(this, r5[19]);
    }

    private final TextView ki() {
        return (TextView) this.X.a(this, r5[24]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NestedScrollView li() {
        return (NestedScrollView) this.h.a(this, r5[2]);
    }

    private final TextView mi() {
        return (TextView) this.Y.a(this, r5[25]);
    }

    private final TextView ni() {
        return (TextView) this.i.a(this, r5[3]);
    }

    private final TextView qi() {
        return (TextView) this.A.a(this, r5[21]);
    }

    private final Toolbar ri() {
        return (Toolbar) this.f.a(this, r5[0]);
    }

    private final ViewGroup si() {
        return (ViewGroup) this.k5.a(this, r5[45]);
    }

    private final TextView ti() {
        return (TextView) this.I.a(this, r5[23]);
    }

    private final TextView uh() {
        return (TextView) this.z.a(this, r5[20]);
    }

    private final ViewGroup vh() {
        return (ViewGroup) this.n.a(this, r5[8]);
    }

    private final ViewStub vi(View view) {
        if (view != null) {
            int i2 = b.$EnumSwitchMapping$0[xh().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return (ViewStub) view.findViewById(gy8.view_stub_button);
                }
                throw new NoWhenBranchMatchedException();
            }
            return (ViewStub) view.findViewById(gy8.view_stub_new_button);
        }
        return null;
    }

    private final ViewGroup wh() {
        return (ViewGroup) this.m.a(this, r5[7]);
    }

    private final ViewStub wi(View view) {
        if (view != null) {
            return (ViewStub) view.findViewById(gy8.promocode_view_stub_bottom);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xi(tia tiaVar, View view) {
        z65.h(tiaVar, "this$0");
        tiaVar.Wh().onBackPressed();
    }

    private final RecyclerView yh() {
        return (RecyclerView) this.l.a(this, r5[6]);
    }

    private final TextView zh() {
        return (TextView) this.k.a(this, r5[5]);
    }

    private final void zi() {
        getChildFragmentManager().A1("PERSONAL_OFFER_CHANGED", this, new r64() { // from class: sia
            @Override // defpackage.r64
            public final void a(String str, Bundle bundle) {
                tia.Ai(tia.this, str, bundle);
            }
        });
    }

    @Override // defpackage.oja
    public void B5() {
        un3.k(zh());
        zh().setText(getString(r09.stop_in_cart));
    }

    @Override // defpackage.oja
    public void C6() {
        NestedScrollView li = li();
        if (syb.Y(li) && !li.isLayoutRequested()) {
            li().o(130);
        } else {
            li.addOnLayoutChangeListener(new z());
        }
    }

    @Override // defpackage.oja
    public void Da() {
        un3.k(Dh());
    }

    @Override // defpackage.oja
    public void Eb() {
        String string = requireContext().getString(r09.cart_items_count_changed_title);
        z65.g(string, "getString(...)");
        Di(this, string, 0, 2, null);
    }

    @Override // defpackage.oja
    public void F(String str) {
        z65.h(str, "infoStoryId");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        d15.a.a(this, requireContext, str, new u(str), null, 8, null);
    }

    @Override // defpackage.oja
    public void G5() {
        un3.e(Ph());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    @Override // defpackage.oja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void He(java.util.List<defpackage.lq3> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "levels"
            defpackage.z65.h(r10, r0)
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L1d
            goto L45
        L1d:
            r3 = r2
            lq3 r3 = (defpackage.lq3) r3
            hn6 r3 = r3.a()
            double r3 = r3.a()
        L28:
            java.lang.Object r5 = r1.next()
            r6 = r5
            lq3 r6 = (defpackage.lq3) r6
            hn6 r6 = r6.a()
            double r6 = r6.a()
            int r8 = java.lang.Double.compare(r3, r6)
            if (r8 <= 0) goto L3f
            r2 = r5
            r3 = r6
        L3f:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L28
        L45:
            lq3 r2 = (defpackage.lq3) r2
            hn6 r1 = r2.a()
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbe
            java.lang.Object r2 = r0.next()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L60
            goto L88
        L60:
            r3 = r2
            lq3 r3 = (defpackage.lq3) r3
            hn6 r3 = r3.a()
            double r3 = r3.a()
        L6b:
            java.lang.Object r5 = r0.next()
            r6 = r5
            lq3 r6 = (defpackage.lq3) r6
            hn6 r6 = r6.a()
            double r6 = r6.a()
            int r8 = java.lang.Double.compare(r3, r6)
            if (r8 >= 0) goto L82
            r2 = r5
            r3 = r6
        L82:
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L6b
        L88:
            lq3 r2 = (defpackage.lq3) r2
            hn6 r0 = r2.a()
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r0)
            android.widget.FrameLayout r0 = r9.Uh()
            nn1 r1 = new nn1
            android.content.Context r4 = r9.requireContext()
            java.lang.String r3 = "requireContext(...)"
            defpackage.z65.g(r4, r3)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            tia$r r3 = new tia$r
            r3.<init>(r2, r9, r10)
            r10 = 1613635587(0x602e2003, float:5.0188127E19)
            r2 = 1
            en1 r10 = defpackage.gn1.c(r10, r2, r3)
            r1.setContent(r10)
            r0.addView(r1)
            return
        Lbe:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            r10.<init>()
            throw r10
        Lc4:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tia.He(java.util.List):void");
    }

    @Override // defpackage.oja
    public void Id() {
        int i2 = gy8.personal_offers_fragment_container;
        String string = getString(r09.personal_offer_block_title);
        int i3 = s19.TextAppearance_MaterialComponents_Subtitle2;
        h18 h18Var = h18.f;
        z65.e(string);
        y8c.a(this, i2, new o08(string, false, false, i3, h18Var, false), new x());
    }

    @Override // defpackage.oja
    public void J() {
        un3.e(Dh());
    }

    @Override // defpackage.oja
    public void J6(op8 op8Var) {
        String string;
        z65.h(op8Var, "promoCode");
        un3.k(hi());
        un3.e(Hh());
        qi().setText(op8Var.g());
        uh().setText(uh().getContext().getString(r09.active_promocode, op8Var.d()));
        Fh().setText(op8Var.c());
        Fh().setText(op8Var.c());
        if (op8Var.f().length() > 0) {
            string = op8Var.f();
        } else {
            string = ti().getContext().getString(fq8.a(op8Var.e()));
            z65.e(string);
        }
        if (op8Var.e() == eq8.b) {
            un3.k(ti());
            ti().setText(string);
            return;
        }
        un3.e(ti());
    }

    @Override // defpackage.oja
    public void Je() {
        un3.e(Rh());
    }

    @Override // defpackage.oja
    public void L0(hn6 hn6Var) {
        z65.h(hn6Var, "total");
        Vh().setText(getString(r09.proceed_to_checkout, un6.b(hn6Var)));
        n1c.e(wh(), Vh());
    }

    @Override // defpackage.oja
    public void L6() {
        int i2 = gy8.personal_offers_fragment_container;
        String string = getString(r09.personal_offer_block_title);
        int i3 = s19.TextAppearance_Dodo_Heading_H2;
        h18 h18Var = h18.f;
        z65.e(string);
        y8c.c(this, i2, new o08(string, false, false, i3, h18Var, false), new m());
    }

    @Override // defpackage.oja
    public void Lf() {
        up8.i.a(cq8.f).show(getParentFragmentManager(), "enter_promo_code_dialog");
    }

    @Override // defpackage.oja
    public void O9() {
        un3.e(gi());
    }

    public final xab Oh() {
        xab xabVar = this.l5;
        if (xabVar != null) {
            return xabVar;
        }
        z65.z("minDeliveryPriceChanger");
        return null;
    }

    @Override // defpackage.oja
    public void P6(lja ljaVar) {
        z65.h(ljaVar, "shoppingCartVO");
        ni().setText(getResources().getQuantityString(e09.c, ljaVar.n(), Integer.valueOf(ljaVar.n()), un6.b(ljaVar.m())));
        int l2 = ljaVar.l();
        ki().setText(getResources().getQuantityString(e09.sauce_plural, l2, Integer.valueOf(l2)));
        TextView mi = mi();
        int i2 = r09.V0;
        mi.setText(getString(i2, un6.b(ljaVar.k())));
        Gh().setText(getString(i2, un6.b(ljaVar.c())));
    }

    @Override // defpackage.oja
    public void R3(hn6 hn6Var) {
        z65.h(hn6Var, "minDeliveryPrice");
        un3.k(Uh());
        Qh().setText(getString(r09.min_delivery_price_message, un6.b(hn6Var)));
    }

    @Override // defpackage.oja
    public void R8() {
        un3.e(si());
    }

    @Override // defpackage.oja
    public void S() {
        un3.k(Ih());
    }

    @Override // defpackage.oja
    public void S4(boolean z2) {
        int i2;
        un3.k(Ph());
        if (z2) {
            i2 = ew8.E;
        } else {
            i2 = ew8.B;
        }
        Ph().setTextColor(iu1.c(requireContext(), i2));
    }

    @Override // defpackage.oja
    public void T1(ce0 ce0Var) {
        z65.h(ce0Var, "discountInfo");
        ira.n.d(ce0Var, cq8.f).show(getParentFragmentManager(), "shopping_cart_fragment");
    }

    @Override // defpackage.oja
    public void T4() {
        PopupWithTextIconView Ch = Ch();
        String string = getString(r09.increased_delivery_fee_description);
        z65.g(string, "getString(...)");
        Ch.setText(string);
    }

    @Override // defpackage.oja
    public void Td() {
        int i2 = gy8.personal_offers_fragment_container;
        String string = getString(r09.personal_offer_block_title);
        int i3 = s19.TextAppearance_Dodo_Heading_H2;
        h18 h18Var = h18.f;
        z65.e(string);
        y8c.a(this, i2, new o08(string, false, false, i3, h18Var, false), new y());
    }

    @Override // defpackage.oja
    public void Va() {
        int i2 = gy8.personal_offers_fragment_container;
        String string = getString(r09.personal_offer_block_title);
        int i3 = s19.TextAppearance_MaterialComponents_Subtitle2;
        h18 h18Var = h18.f;
        z65.e(string);
        y8c.c(this, i2, new o08(string, false, false, i3, h18Var, false), new l());
    }

    @Override // defpackage.oja
    public void Wb(List<? extends or0> list) {
        z65.h(list, "productVOs");
        s0 s0Var = new s0();
        u0 u0Var = new u0();
        v0 v0Var = new v0();
        q0 q0Var = new q0();
        r0 r0Var = new r0();
        t0 t0Var = new t0();
        un3.l(Ah(), gy8.shopping_cart_products_container);
        yh().setAdapter(new k6.a(new k6.a(new k6.a(new k6.a(new k6(list), i0.a, new z68(s0Var, u0Var, v0Var, r0Var, t0Var, pi(), oi(), q0Var), j0.a).b(), k0.a, new ck4(s0Var, u0Var, v0Var, r0Var), l0.a).b(), m0.a, new ug1(s0Var, u0Var, v0Var, q0Var), n0.a).b(), o0.a, new doa(s0Var, u0Var, v0Var, r0Var, t0Var, pi(), oi(), q0Var), p0.a).b().d());
    }

    @Override // defpackage.oja
    public void X2(hn6 hn6Var, hn6 hn6Var2, int i2, int i3) {
        z65.h(hn6Var, "previousPrice");
        z65.h(hn6Var2, "price");
        un3.k(Rh());
        xab Oh = Oh();
        Oh.k(iu1.c(requireContext(), i2));
        Oh.l(new c0());
        Oh.j(new d0());
        Oh.o(new e0(hn6Var));
        Oh.n(new f0(i3));
        Oh.h(hn6Var.a(), hn6Var2.a());
    }

    public final as8<ShoppingCartPresenter> Xh() {
        as8<ShoppingCartPresenter> as8Var = this.e;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.oja
    public void Yg(hn6 hn6Var, int i2) {
        z65.h(hn6Var, "minDeliveryCost");
        String string = getString(i2, un6.c(hn6Var));
        z65.g(string, "getString(...)");
        Rh().setText(string);
        un3.k(Rh());
    }

    @Override // defpackage.oja
    public void Z2() {
        PopupWithTextIconView Jh = Jh();
        String string = getString(r09.loyalty_program_hint_uae);
        z65.g(string, "getString(...)");
        Jh.setText(string);
        un3.k(Jh());
        oma.a(Mh(), new v());
    }

    @Override // defpackage.oja
    public void Z6(w18 w18Var) {
        z65.h(w18Var, "promoAction");
        un3.k(hi());
        un3.e(Hh());
        qi().setText(w18Var.g());
        uh().setText(getString(r09.active_promoaction));
        Fh().setText(w18Var.c());
        String f2 = w18Var.f();
        if (f2.length() == 0) {
            f2 = ti().getContext().getString(fq8.a(w18Var.e()));
            z65.g(f2, "getString(...)");
        }
        if (w18Var.e() == eq8.b) {
            un3.k(ti());
            ti().setText(f2);
            return;
        }
        un3.e(ti());
    }

    @Override // defpackage.d15
    public void bf(Context context, String str, Function0<Unit> function0, Function0<Unit> function02) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "storyId");
        z65.h(function0, "onSuccess");
        z65.h(function02, "onFailure");
        this.c.bf(context, str, function0, function02);
    }

    @Override // defpackage.oja
    public void da() {
        un3.k(si());
        z8c.a(this, gy8.upsale_fragment_container, new s(), new t());
    }

    @Override // defpackage.oja
    public void dg(hn6 hn6Var) {
        z65.h(hn6Var, "priceBelowMinDeliveryPrice");
        Nh().setText(getString(r09.min_delivery_price_button_title, un6.b(hn6Var)));
        n1c.e(wh(), Nh());
    }

    @Override // defpackage.oja
    public void e3(hn6 hn6Var) {
        z65.h(hn6Var, "deliveryFee");
        Bh().setText(un6.b(hn6Var));
    }

    @Override // defpackage.oja
    public void e4() {
        un3.e(Uh());
    }

    @Override // defpackage.oja
    public void ff() {
        dy6.a aVar = dy6.i;
        dy6 b2 = aVar.b();
        aVar.c(b2, this, new w(b2, this));
        b2.show(getChildFragmentManager(), "nice_bonus_info_fragment");
    }

    @Override // defpackage.oja
    public void h8() {
        String string = requireContext().getString(r09.price_changed_title);
        z65.g(string, "getString(...)");
        Di(this, string, 0, 2, null);
    }

    @Override // defpackage.f70
    protected int hh() {
        return ew8.d;
    }

    @Override // defpackage.oja
    public void i4(boolean z2) {
        if (z2) {
            PopupWithTextIconView Ch = Ch();
            String string = getString(r09.free_delivery_promo_info_text_in_shopping_cart_always_free);
            z65.g(string, "getString(...)");
            Ch.setText(string);
            return;
        }
        PopupWithTextIconView Ch2 = Ch();
        String string2 = getString(r09.free_delivery_promo_info_text_in_shopping_cart);
        z65.g(string2, "getString(...)");
        Ch2.setText(string2);
    }

    @Override // defpackage.oja
    public void kc() {
        PopupWithTextIconView Ch = Ch();
        String string = getString(r09.delivery_fee_description);
        z65.g(string, "getString(...)");
        Ch.setText(string);
    }

    @Override // defpackage.oja
    public void ld(hn6 hn6Var, hn6 hn6Var2, int i2, int i3) {
        View view;
        z65.h(hn6Var, "previousPrice");
        z65.h(hn6Var2, "price");
        un3.k(Uh());
        Iterator<View> it = dzb.b(Uh()).iterator();
        while (true) {
            if (it.hasNext()) {
                view = it.next();
                if (view instanceof nn1) {
                    break;
                }
            } else {
                view = null;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            un3.e(view2);
        }
        xab Oh = Oh();
        Oh.k(iu1.c(requireContext(), i2));
        Oh.l(new n());
        Oh.j(new o());
        Oh.o(new p(hn6Var));
        Oh.n(new q(i3));
        Oh.h(hn6Var.a(), hn6Var2.a());
    }

    @Override // defpackage.oja
    public void n0() {
        un3.l(Ah(), gy8.shopping_cart_empty_container);
    }

    @Override // defpackage.oja
    public void o0() {
        un3.e(Ih());
    }

    @Override // defpackage.oja
    public void oe(long j2) {
        Lh().setText(getString(r09.O1, String.valueOf(j2)));
        un3.k(Kh());
    }

    public final f5b oi() {
        f5b f5bVar = this.n5;
        if (f5bVar != null) {
            return f5bVar;
        }
        z65.z("systemTimeProvider");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        mia.a.a().a((ShoppingCartFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ShoppingCartFeatureDependencies.class))).a(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        View ui = ui(layoutInflater, viewGroup);
        ViewStub wi = wi(ui);
        if (wi != null) {
            wi.inflate();
        }
        ViewStub vi = vi(ui);
        if (vi != null) {
            vi.inflate();
        }
        return ui;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        if (xh() == cq0.b) {
            p45.l(wh(), 0, 0, 0, (int) kx9.a(16), 7, null);
            p45.l(vh(), 0, 0, 0, 0, 5, null);
            p45.l(Ph(), 0, (int) kx9.a(4), 0, (int) kx9.a(8), 5, null);
        }
        yh().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView yh = yh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        yh.addItemDecoration(v99Var.a(requireContext, 0));
        oma.a(Hh(), new c());
        oma.a(ji(), new d());
        oma.a(ii(), new e());
        oma.a(Sh(), new f());
        oma.a(Vh(), new g());
        oma.a(Nh(), new h());
        oma.a(Zh(), new i());
        oma.a(Eh(), new j());
        Bi(Wh().i0());
        ri().setNavigationOnClickListener(new View.OnClickListener() { // from class: ria
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tia.xi(tia.this, view2);
            }
        });
        zi();
        yi(new xab(false, 0L, iu1.c(requireContext(), ew8.C), 2, null));
    }

    public final u18 pi() {
        u18 u18Var = this.m5;
        if (u18Var != null) {
            return u18Var;
        }
        z65.z("timerFormatter");
        return null;
    }

    @Override // defpackage.oja
    public void r5() {
        un3.e(zh());
    }

    @Override // defpackage.oja
    public void s1() {
        un3.k(si());
        z8c.b(this, gy8.upsale_fragment_container, new g0(), new h0());
    }

    @Override // defpackage.oja
    public void se() {
        Vh().setState(DodoButton.a.a);
    }

    @Override // defpackage.oja
    public void showProgressBar() {
        Vh().setState(DodoButton.a.b);
    }

    public View ui(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        z65.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(gz8.fragment_shopping_cart, viewGroup, false);
        z65.g(inflate, "inflate(...)");
        return inflate;
    }

    @Override // defpackage.oja
    public void v1() {
        un3.e(Kh());
    }

    @Override // defpackage.oja
    public void w1(boolean z2) {
        un3.o(Th(), z2);
    }

    @Override // defpackage.oja
    public void xc() {
        un3.e(hi());
        un3.k(Hh());
    }

    @Override // defpackage.oja
    public void xg() {
        NestedScrollView li = li();
        if (syb.Y(li) && !li.isLayoutRequested()) {
            li().scrollTo(0, 0);
        } else {
            li.addOnLayoutChangeListener(new b0());
        }
    }

    public final cq0 xh() {
        cq0 cq0Var = this.d;
        if (cq0Var != null) {
            return cq0Var;
        }
        z65.z("cartButtonPosition");
        return null;
    }

    @Override // defpackage.oja
    public void yd() {
        Bh().setText(getString(r09.J0));
    }

    public final void yi(xab xabVar) {
        z65.h(xabVar, "<set-?>");
        this.l5 = xabVar;
    }

    @Override // defpackage.oja
    public void z8(lk8 lk8Var, int i2, String str, hn6 hn6Var) {
        List<jk8> F0;
        z65.h(lk8Var, "prizotekaVO");
        z65.h(str, "progressDescription");
        z65.h(hn6Var, "total");
        Ei(i2);
        fi().setText(lk8Var.c());
        ai().setText(str);
        di().setText(lk8Var.b());
        PrizotekaProgressView bi = bi();
        F0 = sc1.F0(lk8Var.a());
        bi.d(F0);
        bi().e((float) hn6Var.a());
        un3.k(gi());
    }
}
