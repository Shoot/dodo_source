package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.InitializedKusto;
import com.dodopizza.kustoworker.Kusto;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.cart.AddedIngredientEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k63;
import defpackage.ko5;
import defpackage.sk9;
import im.threads.business.transport.MessageAttributes;
import im.threads.ui.fragments.ChatFragment;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.data.dto.request.StateRequest;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.state.dto.StateDto;
/* compiled from: StateAnalyzer.kt */
@Metadata(d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002CDB¾\u0002\b\u0007\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010P\u001a\u00020N\u0012\u0006\u0010S\u001a\u00020Q\u0012\u0006\u0010V\u001a\u00020T\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010\\\u001a\u00020Z\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010b\u001a\u00020`\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010h\u001a\u00020f\u0012\u0006\u0010k\u001a\u00020i\u0012\u0006\u0010n\u001a\u00020l\u0012\u0006\u0010q\u001a\u00020o\u0012\u0006\u0010t\u001a\u00020r\u0012\f\u0010x\u001a\b\u0012\u0004\u0012\u00020v0u\u0012\u0006\u0010{\u001a\u00020y\u0012\u0006\u0010~\u001a\u00020|\u0012\u0007\u0010\u0081\u0001\u001a\u00020\u007f\u0012\b\u0010\u0084\u0001\u001a\u00030\u0082\u0001\u0012\b\u0010\u0087\u0001\u001a\u00030\u0085\u0001\u0012\b\u0010\u008a\u0001\u001a\u00030\u0088\u0001\u0012\b\u0010\u008d\u0001\u001a\u00030\u008b\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u008e\u0001\u0012\b\u0010\u0094\u0001\u001a\u00030\u0092\u0001\u0012\b\u0010\u0098\u0001\u001a\u00030\u0095\u0001\u0012\b\u0010\u009b\u0001\u001a\u00030\u0099\u0001\u0012\b\u0010\u009e\u0001\u001a\u00030\u009c\u0001\u0012\b\u0010¡\u0001\u001a\u00030\u009f\u0001\u0012\b\u0010¤\u0001\u001a\u00030¢\u0001\u0012\b\u0010§\u0001\u001a\u00030¥\u0001\u0012\b\u0010ª\u0001\u001a\u00030¨\u0001\u0012\b\u0010\u00ad\u0001\u001a\u00030«\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0010\u001a\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\"\u001a\u00020\u0013*\u00020\u00022\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.H\u0002J\u0012\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u000101H\u0002J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0018\u00108\u001a\u0002072\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H\u0002J\b\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0016H\u0002J\b\u0010>\u001a\u00020\u0004H\u0002J\b\u0010?\u001a\u00020\u0002H\u0016J\u0010\u0010B\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@H\u0016J\b\u0010C\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u00020\u0004H\u0016R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010jR\u0014\u0010n\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010mR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010pR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010zR\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010}R\u0016\u0010\u0081\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0089\u0001R\u0017\u0010\u008d\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u009b\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u009a\u0001R\u0017\u0010\u009e\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010 \u0001R\u0017\u0010¤\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010£\u0001R\u0017\u0010§\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010¦\u0001R\u0017\u0010ª\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010©\u0001R\u0017\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¬\u0001R \u0010°\u0001\u001a\f \u000f*\u0005\u0018\u00010®\u00010®\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010±\u0001R\u001f\u0010´\u0001\u001a\n \u000f*\u0004\u0018\u00010v0v8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010³\u0001¨\u0006·\u0001"}, d2 = {"Leua;", "Ldua;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "newState", "", "C", "oldState", "f", "o", "w", "x", "firstState", "secondState", "", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "kotlin.jvm.PlatformType", "B", "firstValuesItem", "secondValue", "", "l", "state", "", "z", "q", "p", Image.TYPE_HIGH, "j", "r", "n", "", "error", "D", "errorCode", "v", "O", "M", "N", "L", "H", "K", "F", "I", "G", "E", "k", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "deliveryAddress", "g", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "locationEntity", "i", Image.TYPE_SMALL, "previousState", "currentState", "Leua$a;", "u", "P", "J", Image.TYPE_MEDIUM, MessageAttributes.TYPE, com.huawei.hms.push.e.a, "t", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/backend/domain/state/dto/StateDto;", "stateDto", DateTokenConverter.CONVERTER_KEY, "a", "b", "Lvc6;", "Lvc6;", "memoryDataSource", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lava;", "Lava;", "stateProvider", "Lktb;", "Lktb;", "upsaleStateService", "Ltsb;", "Ltsb;", "upsaleItemsService", "Lko5;", "Lko5;", "legacyCartService", "Lih6;", "Lih6;", "menuUpdater", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "Ljv5;", "localityService", "Lv53;", "Lv53;", "domainState", "Lg00;", "Lg00;", "authorizationService", "Lk63;", "Lk63;", "domainEvents", "Ln52;", "Ln52;", "customerRepository", "Lc62;", "Lc62;", "customizationService", "Lv42;", "Lv42;", "customerAddressRepository", "Las0;", "Las0;", "cartQueueService", "Las8;", "Lru/dodopizza/app/domain/DodopizzaApi;", "Las8;", "dodoPizzaApiProvider", "Lgua;", "Lgua;", "stateConverter", "Low7;", "Low7;", "paymentWayMapper", "Lit7;", "Lit7;", "paymentMethodFilter", "Ltw7;", "Ltw7;", "paymentWayService", "Lvg7;", "Lvg7;", "orderPizzeriaStateService", "Lhq3;", "Lhq3;", "featureService", "Lip4;", "Lip4;", "hotAndReadyUpdater", "Ljp3;", "y", "Ljp3;", "favoriteProductRepository", "Lne6;", "Lne6;", "menuItemRepository", "Lfi7;", "A", "Lfi7;", "orderRepository", "Lgc;", "Lgc;", "analytics", "Lbq;", "Lbq;", "applyedPromoOfferRepository", "Lh08;", "Lh08;", "personalOfferRepository", "Lv06;", "Lv06;", "loyaltyMenuRepository", "Lu16;", "Lu16;", "loyaltyMissionsRepository", "Lbb1;", "Lbb1;", "coinsExpirationsRepository", "Ltb9;", "Ltb9;", "referralSystemRepository", "Lorg/slf4j/Logger;", "Lorg/slf4j/Logger;", "logger", "()Ljava/lang/String;", "selectedLocalityId", "()Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "<init>", "(Lvc6;Lf8c;Lava;Lktb;Ltsb;Lko5;Lih6;Lru/dodopizza/app/domain/country/CountryService;Ljv5;Lv53;Lg00;Lk63;Ln52;Lc62;Lv42;Las0;Las8;Lgua;Low7;Lit7;Ltw7;Lvg7;Lhq3;Lip4;Ljp3;Lne6;Lfi7;Lgc;Lbq;Lh08;Lv06;Lu16;Lbb1;Ltb9;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eua  reason: default package */
/* loaded from: classes4.dex */
public final class eua implements dua {
    public static final b J = new b(null);
    private static final List<Integer> K;
    private final fi7 A;
    private final gc B;
    private final bq C;
    private final h08 D;
    private final v06 E;
    private final u16 F;
    private final bb1 G;
    private final tb9 H;
    private final Logger I;
    private final vc6 a;
    private final f8c b;
    private final ava c;
    private final ktb d;
    private final tsb e;
    private final ko5 f;
    private final ih6 g;
    private final CountryService h;
    private final jv5 i;
    private final v53 j;
    private final g00 k;
    private final k63 l;
    private final n52 m;
    private final c62 n;
    private final v42 o;
    private final as0 p;
    private final as8<DodopizzaApi> q;
    private final gua r;
    private final ow7 s;
    private final it7 t;
    private final tw7 u;
    private final vg7 v;
    private final hq3 w;
    private final ip4 x;
    private final jp3 y;
    private final ne6 z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StateAnalyzer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Leua$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eua$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a a = new a("PROMOCODE_CHANGED", 0);
        public static final a b = new a("PRICE_CHANGED", 1);
        public static final a c = new a("ITEMS_COUNT_CHANGED", 2);
        public static final a d = new a("NO_CHANGES", 3);
        private static final /* synthetic */ a[] e;
        private static final /* synthetic */ kj3 f;

        static {
            a[] a2 = a();
            e = a2;
            f = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* compiled from: StateAnalyzer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Leua$b;", "", "", "", "PIZZERIA_IN_STOP_ERRORS", "Ljava/util/List;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eua$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: StateAnalyzer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eua$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateAnalyzer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/dodopizza/kustoworker/InitializedKusto;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eua$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<InitializedKusto, Unit> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InitializedKusto initializedKusto) {
            invoke2(initializedKusto);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InitializedKusto initializedKusto) {
            z65.h(initializedKusto, "$this$upgradeSession");
            initializedKusto.setSessionParam(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateAnalyzer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/dodopizza/kustoworker/InitializedKusto;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eua$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<InitializedKusto, Unit> {
        final /* synthetic */ StateEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(StateEntity stateEntity) {
            super(1);
            this.a = stateEntity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InitializedKusto initializedKusto) {
            invoke2(initializedKusto);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InitializedKusto initializedKusto) {
            z65.h(initializedKusto, "$this$upgradeSession");
            initializedKusto.setSessionParam(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, this.a.getWorkflowId());
        }
    }

    static {
        List<Integer> o;
        o = kc1.o(203, Integer.valueOf((int) ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO), 220, 221);
        K = o;
    }

    public eua(vc6 vc6Var, f8c f8cVar, ava avaVar, ktb ktbVar, tsb tsbVar, ko5 ko5Var, ih6 ih6Var, CountryService countryService, jv5 jv5Var, v53 v53Var, g00 g00Var, k63 k63Var, n52 n52Var, c62 c62Var, v42 v42Var, as0 as0Var, as8<DodopizzaApi> as8Var, gua guaVar, ow7 ow7Var, it7 it7Var, tw7 tw7Var, vg7 vg7Var, hq3 hq3Var, ip4 ip4Var, jp3 jp3Var, ne6 ne6Var, fi7 fi7Var, gc gcVar, bq bqVar, h08 h08Var, v06 v06Var, u16 u16Var, bb1 bb1Var, tb9 tb9Var) {
        z65.h(vc6Var, "memoryDataSource");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(ktbVar, "upsaleStateService");
        z65.h(tsbVar, "upsaleItemsService");
        z65.h(ko5Var, "legacyCartService");
        z65.h(ih6Var, "menuUpdater");
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(v53Var, "domainState");
        z65.h(g00Var, "authorizationService");
        z65.h(k63Var, "domainEvents");
        z65.h(n52Var, "customerRepository");
        z65.h(c62Var, "customizationService");
        z65.h(v42Var, "customerAddressRepository");
        z65.h(as0Var, "cartQueueService");
        z65.h(as8Var, "dodoPizzaApiProvider");
        z65.h(guaVar, "stateConverter");
        z65.h(ow7Var, "paymentWayMapper");
        z65.h(it7Var, "paymentMethodFilter");
        z65.h(tw7Var, "paymentWayService");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(hq3Var, "featureService");
        z65.h(ip4Var, "hotAndReadyUpdater");
        z65.h(jp3Var, "favoriteProductRepository");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(fi7Var, "orderRepository");
        z65.h(gcVar, "analytics");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(h08Var, "personalOfferRepository");
        z65.h(v06Var, "loyaltyMenuRepository");
        z65.h(u16Var, "loyaltyMissionsRepository");
        z65.h(bb1Var, "coinsExpirationsRepository");
        z65.h(tb9Var, "referralSystemRepository");
        this.a = vc6Var;
        this.b = f8cVar;
        this.c = avaVar;
        this.d = ktbVar;
        this.e = tsbVar;
        this.f = ko5Var;
        this.g = ih6Var;
        this.h = countryService;
        this.i = jv5Var;
        this.j = v53Var;
        this.k = g00Var;
        this.l = k63Var;
        this.m = n52Var;
        this.n = c62Var;
        this.o = v42Var;
        this.p = as0Var;
        this.q = as8Var;
        this.r = guaVar;
        this.s = ow7Var;
        this.t = it7Var;
        this.u = tw7Var;
        this.v = vg7Var;
        this.w = hq3Var;
        this.x = ip4Var;
        this.y = jp3Var;
        this.z = ne6Var;
        this.A = fi7Var;
        this.B = gcVar;
        this.C = bqVar;
        this.D = h08Var;
        this.E = v06Var;
        this.F = u16Var;
        this.G = bb1Var;
        this.H = tb9Var;
        this.I = LoggerFactory.getLogger("StateAnalyzer");
    }

    private final String A() {
        String str;
        dt5 i = this.i.i();
        if (i != null) {
            str = i.getId();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private final List<CartItemEntity> B(StateEntity stateEntity, StateEntity stateEntity2) {
        k0<CartItemEntity> cartItems;
        CartProductEntity right;
        k0<AddedIngredientEntity> addedIngredients;
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (cartItems = cart.getCartItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (CartItemEntity cartItemEntity : cartItems) {
                CartItemEntity cartItemEntity2 = cartItemEntity;
                z65.e(cartItemEntity2);
                if (!l(cartItemEntity2, stateEntity2) || cartItemEntity2.getErrorCode() == 1) {
                    CustomizationEntity customizationEntity = cartItemEntity2.getCustomizationEntity();
                    if (customizationEntity != null && (addedIngredients = customizationEntity.getAddedIngredients()) != null && !addedIngredients.isEmpty()) {
                        for (AddedIngredientEntity addedIngredientEntity : addedIngredients) {
                            if (addedIngredientEntity.isInStop()) {
                                break;
                            }
                        }
                    }
                    PizzaHalvesEntity pizzaHalves = cartItemEntity2.getPizzaHalves();
                    if (pizzaHalves != null) {
                        CartProductEntity left = pizzaHalves.getLeft();
                        if (left != null && left.isInStop()) {
                        }
                    }
                    PizzaHalvesEntity pizzaHalves2 = cartItemEntity2.getPizzaHalves();
                    if (pizzaHalves2 != null && (right = pizzaHalves2.getRight()) != null && right.isInStop()) {
                    }
                }
                arrayList.add(cartItemEntity);
            }
            return arrayList;
        }
        return null;
    }

    private final void C(StateEntity stateEntity) {
        DataPromoCodeEntity dataPromoCodeEntity;
        Kusto.Companion.upgradeSession(new e(stateEntity));
        this.I.debug("::handleNewState");
        StateEntity e2 = this.c.e();
        k(e2, stateEntity);
        J(stateEntity);
        O(e2, stateEntity);
        M(e2, stateEntity);
        N(e2, stateEntity);
        L(e2, stateEntity);
        PersonalPromoActionEntity personalPromoActionEntity = null;
        ko5.a.a(this.f, stateEntity, false, 2, null);
        m(e2, stateEntity);
        K(e2, stateEntity);
        g(stateEntity.getDeliveryAddressEntity());
        i(stateEntity.getClientDeliveryLocationEntity());
        v53 v53Var = this.j;
        CartEntity cart = stateEntity.getCart();
        if (cart != null) {
            dataPromoCodeEntity = cart.getPromoCode();
        } else {
            dataPromoCodeEntity = null;
        }
        v53Var.p(jq8.a(dataPromoCodeEntity));
        bq bqVar = this.C;
        CartEntity cart2 = stateEntity.getCart();
        if (cart2 != null) {
            personalPromoActionEntity = cart2.getPromoAction();
        }
        bqVar.b(iq8.a(personalPromoActionEntity));
        f(e2, stateEntity);
    }

    private final boolean D(int i, StateEntity stateEntity, StateEntity stateEntity2) {
        if (!v(stateEntity, i) && v(stateEntity2, i)) {
            return true;
        }
        return false;
    }

    private final boolean E(StateEntity stateEntity, StateEntity stateEntity2) {
        if (!z65.c(stateEntity.getCurrentOrderType(), stateEntity2.getCurrentOrderType())) {
            jk7 c2 = jua.c(stateEntity);
            jk7 jk7Var = jk7.g;
            if (c2 == jk7Var || jua.c(stateEntity2) == jk7Var) {
                return true;
            }
        }
        return false;
    }

    private final boolean F(StateEntity stateEntity) {
        k0<StateErrorEntity> errors = stateEntity.getErrors();
        if ((errors instanceof Collection) && errors.isEmpty()) {
            return false;
        }
        for (StateErrorEntity stateErrorEntity : errors) {
            Integer errorCode = stateErrorEntity.getErrorCode();
            if (errorCode != null && errorCode.intValue() == 37) {
                return true;
            }
        }
        return false;
    }

    private final boolean G(StateEntity stateEntity, StateEntity stateEntity2) {
        if (!stateEntity.isEmpty() && z65.c(stateEntity.getSelectedPizzeriaId(), stateEntity2.getSelectedPizzeriaId()) && !E(stateEntity, stateEntity2)) {
            return false;
        }
        return true;
    }

    private final boolean H(StateEntity stateEntity, StateEntity stateEntity2) {
        if (!G(stateEntity, stateEntity2) && stateEntity.getProductIdsStopList().size() == stateEntity2.getProductIdsStopList().size() && stateEntity.getProductIdsStopList().containsAll(stateEntity2.getProductIdsStopList())) {
            return false;
        }
        return true;
    }

    private final boolean I(StateEntity stateEntity, StateEntity stateEntity2) {
        if ((G(stateEntity, stateEntity2) && jua.c(stateEntity2) == jk7.g) || F(stateEntity2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(com.dodopizza.persistence.entity.cart.StateEntity r7) {
        /*
            r6 = this;
            ava r0 = r6.c
            r0.a(r7)
            r6.P()
            ktb r0 = r6.d
            java.lang.String r1 = r7.getWorkflowId()
            r0.b(r1)
            tsb r0 = r6.e
            com.dodopizza.persistence.entity.cart.UpsaleEntity r1 = r7.getUpsale()
            r2 = 0
            if (r1 == 0) goto L38
            kotlin.jvm.functions.Function2 r3 = defpackage.fva.G()
            com.dodopizza.persistence.entity.personalization.PersonalizationEntity r4 = r7.getPersonalization()
            if (r4 == 0) goto L2a
            com.dodopizza.persistence.entity.personalization.UpsellProductsEntity r4 = r4.getUpsellProducts()
            if (r4 != 0) goto L30
        L2a:
            com.dodopizza.persistence.entity.personalization.UpsellProductsEntity r4 = new com.dodopizza.persistence.entity.personalization.UpsellProductsEntity
            r5 = 1
            r4.<init>(r2, r5, r2)
        L30:
            java.lang.Object r1 = r3.invoke(r1, r4)
            ksb r1 = (defpackage.ksb) r1
            if (r1 != 0) goto L3e
        L38:
            ksb r1 = new ksb
            r3 = 3
            r1.<init>(r2, r2, r3, r2)
        L3e:
            r0.c(r1)
            vg7 r0 = r6.v
            java.lang.String r1 = r7.getOrderPizzeriaId()
            d88$a r2 = defpackage.d88.x
            d88 r2 = r2.a()
            java.lang.String r2 = r2.getId()
            java.lang.Object r1 = defpackage.mh5.c(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.d(r1)
            ow7 r0 = r6.s
            it7 r1 = r6.t
            java.util.List r7 = r7.getPaymentMethods()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Collection r7 = r1.a(r7)
            java.util.Collection r7 = r0.c(r7)
            tw7 r0 = r6.u
            r0.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eua.J(com.dodopizza.persistence.entity.cart.StateEntity):void");
    }

    private final void K(StateEntity stateEntity, StateEntity stateEntity2) {
        if (G(stateEntity, stateEntity2)) {
            this.l.b(j63.f);
        }
    }

    private final void L(StateEntity stateEntity, StateEntity stateEntity2) {
        if (H(stateEntity, stateEntity2)) {
            this.y.clear();
        }
    }

    private final void M(StateEntity stateEntity, StateEntity stateEntity2) {
        if (I(stateEntity, stateEntity2)) {
            this.x.d();
        }
    }

    private final void N(StateEntity stateEntity, StateEntity stateEntity2) {
        if (G(stateEntity, stateEntity2)) {
            this.g.d();
        }
    }

    private final void O(StateEntity stateEntity, StateEntity stateEntity2) {
        List list;
        List list2;
        if (this.w.a(bq3.v5)) {
            PersonalizationEntity personalization = stateEntity.getPersonalization();
            if (personalization != null) {
                list = personalization.getMenuPersonalPricesInfo();
            } else {
                list = null;
            }
            if (list == null) {
                list = kc1.l();
            }
            PersonalizationEntity personalization2 = stateEntity2.getPersonalization();
            if (personalization2 != null) {
                list2 = personalization2.getMenuPersonalPricesInfo();
            } else {
                list2 = null;
            }
            if (list2 == null) {
                list2 = kc1.l();
            }
            if (!MenuPersonalPriceInfoEntity.Companion.personalPricesAreEqual(list2, list)) {
                this.z.b();
                k63.a.a(this.l, null, 1, null);
            }
        }
    }

    private final void P() {
        this.z.b();
    }

    private final void e(String str) {
        this.B.a(kd.a(str));
    }

    private final void f(StateEntity stateEntity, StateEntity stateEntity2) {
        Object b2;
        try {
            sk9.a aVar = sk9.b;
            n(stateEntity, stateEntity2);
            r(stateEntity, stateEntity2);
            j(stateEntity, stateEntity2);
            h(stateEntity, stateEntity2);
            q(stateEntity, stateEntity2);
            p(stateEntity, stateEntity2);
            o(stateEntity, stateEntity2);
            b2 = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b2 = sk9.b(vk9.a(th));
        }
        Throwable d2 = sk9.d(b2);
        if (d2 != null) {
            this.I.warn("Failed to analyze errors", d2);
        }
    }

    private final void g(DeliveryAddressEntity deliveryAddressEntity) {
        if (deliveryAddressEntity != null) {
            w6 h = this.o.h(deliveryAddressEntity);
            if (h == null) {
                h = w6.n;
            }
            if (!z65.c(h, this.j.l())) {
                this.j.h(h);
            }
        }
    }

    private final void h(StateEntity stateEntity, StateEntity stateEntity2) {
        if (D(213, stateEntity, stateEntity2)) {
            e("AddressInStop");
        }
    }

    private final void i(ClientDeliveryLocationEntity clientDeliveryLocationEntity) {
        e91 a2 = f91.a(clientDeliveryLocationEntity);
        if (!a2.e() && !z65.c(a2, this.j.j())) {
            this.j.n(a2);
        }
    }

    private final void j(StateEntity stateEntity, StateEntity stateEntity2) {
        if (D(212, stateEntity, stateEntity2)) {
            e("DeliveryIsStopped");
        }
    }

    private final void k(StateEntity stateEntity, StateEntity stateEntity2) {
        int i = c.$EnumSwitchMapping$0[u(stateEntity, stateEntity2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    stateEntity2.setCartError(1073741823);
                    return;
                }
                return;
            }
            stateEntity2.setCartError(20);
            return;
        }
        stateEntity2.setCartError(715827882);
    }

    private final boolean l(CartItemEntity cartItemEntity, StateEntity stateEntity) {
        k0<CartItemEntity> cartItems;
        CartEntity cart = stateEntity.getCart();
        if (cart == null || (cartItems = cart.getCartItems()) == null || cartItems.isEmpty()) {
            return false;
        }
        for (CartItemEntity cartItemEntity2 : cartItems) {
            if (z65.c(cartItemEntity2.getProductId(), cartItemEntity.getProductId())) {
                return true;
            }
        }
        return false;
    }

    private final void m(StateEntity stateEntity, StateEntity stateEntity2) {
        this.f.c(stateEntity, stateEntity2);
    }

    private final void n(StateEntity stateEntity, StateEntity stateEntity2) {
        List<Integer> list = K;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Number number : list) {
                if (D(number.intValue(), stateEntity, stateEntity2)) {
                    e("PizzeriaInStop");
                    return;
                }
            }
        }
    }

    private final void o(StateEntity stateEntity, StateEntity stateEntity2) {
        if (!stateEntity.hasProductInStop() && stateEntity2.hasProductInStop()) {
            e("ProductsInStop");
            w(stateEntity2, stateEntity);
        } else if (stateEntity.hasProductInStop()) {
            x(stateEntity, stateEntity2);
        }
    }

    private final void p(StateEntity stateEntity, StateEntity stateEntity2) {
        List o;
        String str;
        o = kc1.o(2, 3);
        if (jua.d(stateEntity) != jua.d(stateEntity2) && o.contains(Integer.valueOf(jua.d(stateEntity2)))) {
            if (jua.e(stateEntity2) == 2) {
                str = "PromoactionConditionsAreNotMet";
            } else {
                str = "PromoactionDoesNotExist";
            }
            e(str);
        }
    }

    private final void q(StateEntity stateEntity, StateEntity stateEntity2) {
        List o;
        String str;
        o = kc1.o(2, 3);
        if (jua.e(stateEntity) != jua.e(stateEntity2) && o.contains(Integer.valueOf(jua.e(stateEntity2)))) {
            if (jua.e(stateEntity2) == 2) {
                str = "PromocodeConditionsAreNotMet";
            } else {
                str = "PromocodeDoesNotExist";
            }
            e(str);
        }
    }

    private final void r(StateEntity stateEntity, StateEntity stateEntity2) {
        if (D(211, stateEntity, stateEntity2)) {
            e("UndeliverableAddress");
        }
    }

    private final void s(StateEntity stateEntity) {
        Integer step = stateEntity.getStep();
        if (step != null && step.intValue() == 3) {
            this.a.f(oqb.a);
        } else if (step != null && step.intValue() == 6) {
            this.a.f(oqb.c);
        }
    }

    private final void t() {
        Kusto.Companion.upgradeSession(d.a);
        StateEntity stateEntity = new StateEntity(null, null, null, false, null, null, null, A(), 0.0d, 0.0d, 0, null, null, null, Integer.valueOf(this.i.a()), null, wy1.a(this.h, this.i), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, -82049, null);
        this.D.a();
        this.c.c();
        this.c.a(stateEntity);
        this.n.e();
        this.d.b(stateEntity.getWorkflowId());
        this.e.c(new ksb(null, null, 3, null));
        this.f.b();
        ko5.a.a(this.f, stateEntity, false, 2, null);
        this.v.a(d88.x.a());
        this.A.clear();
    }

    private final a u(StateEntity stateEntity, StateEntity stateEntity2) {
        boolean z;
        if (z65.c(stateEntity.getLocalityId(), stateEntity2.getLocalityId())) {
            boolean z2 = !z65.c(stateEntity.getCurrentOrderType(), stateEntity2.getCurrentOrderType());
            if (jua.b(stateEntity) == jua.b(stateEntity2)) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = !z;
            if (jua.e(stateEntity) == 1 && jua.e(stateEntity2) == 2) {
                return a.a;
            }
            if (jua.f(stateEntity) < jua.f(stateEntity2) && !z2 && !z3) {
                return a.b;
            }
            if (jua.g(stateEntity) < jua.g(stateEntity2) && !z2 && !z3) {
                return a.b;
            }
            if (jua.a(stateEntity) > jua.a(stateEntity2)) {
                return a.c;
            }
            return a.d;
        }
        return a.d;
    }

    private final boolean v(StateEntity stateEntity, int i) {
        k0<StateErrorEntity> errors = stateEntity.getErrors();
        if ((errors instanceof Collection) && errors.isEmpty()) {
            return false;
        }
        for (StateErrorEntity stateErrorEntity : errors) {
            Integer errorCode = stateErrorEntity.getErrorCode();
            if (errorCode != null && errorCode.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    private final void w(StateEntity stateEntity, StateEntity stateEntity2) {
        String str;
        List<CartItemEntity> B = B(stateEntity, stateEntity2);
        String z = z(stateEntity);
        if (B != null) {
            for (CartItemEntity cartItemEntity : B) {
                gc gcVar = this.B;
                String category = cartItemEntity.getCategory();
                String name = cartItemEntity.getName();
                double price = cartItemEntity.getPrice();
                int count = cartItemEntity.getCount();
                String productId = cartItemEntity.getProductId();
                if (productId == null) {
                    productId = "null";
                }
                String str2 = productId;
                if (z == null) {
                    str = "";
                } else {
                    str = z;
                }
                gcVar.a(kd.b(category, name, price, "in", count, str2, str, this.h.c(String.valueOf(this.i.a())).b().getCode()));
            }
        }
    }

    private final void x(StateEntity stateEntity, StateEntity stateEntity2) {
        String str;
        List<CartItemEntity> B = B(stateEntity, stateEntity2);
        List<CartItemEntity> B2 = B(stateEntity2, stateEntity);
        ArrayList<CartItemEntity> arrayList = new ArrayList();
        if (B2 != null && B != null) {
            for (CartItemEntity cartItemEntity : B) {
                if (!B2.contains(cartItemEntity)) {
                    z65.e(cartItemEntity);
                    arrayList.add(cartItemEntity);
                }
            }
        }
        String z = z(stateEntity);
        for (CartItemEntity cartItemEntity2 : arrayList) {
            gc gcVar = this.B;
            String category = cartItemEntity2.getCategory();
            String name = cartItemEntity2.getName();
            double price = cartItemEntity2.getPrice();
            int count = cartItemEntity2.getCount();
            String productId = cartItemEntity2.getProductId();
            if (productId == null) {
                productId = "null";
            }
            String str2 = productId;
            if (z == null) {
                str = "";
            } else {
                str = z;
            }
            gcVar.a(kd.b(category, name, price, "out", count, str2, str, this.h.c(String.valueOf(this.i.a())).b().getCode()));
        }
    }

    private final DodopizzaApi y() {
        return this.q.get();
    }

    private final String z(StateEntity stateEntity) {
        Integer errorCode;
        Integer errorCode2;
        Integer errorCode3;
        for (StateErrorEntity stateErrorEntity : stateEntity.getErrors()) {
            Integer errorCode4 = stateErrorEntity.getErrorCode();
            if ((errorCode4 != null && errorCode4.intValue() == 21) || (((errorCode = stateErrorEntity.getErrorCode()) != null && errorCode.intValue() == 2) || (((errorCode2 = stateErrorEntity.getErrorCode()) != null && errorCode2.intValue() == 38) || ((errorCode3 = stateErrorEntity.getErrorCode()) != null && errorCode3.intValue() == 37)))) {
                return stateErrorEntity.getDescription();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.dua
    public void a() {
        this.k.f();
        this.m.c(n42.l.a());
        this.c.c();
        this.A.clear();
        this.p.clear();
        this.D.a();
        this.E.clear();
        this.F.clear();
        this.G.clear();
        this.H.a();
        this.o.clear();
        this.v.a(d88.x.a());
        v53 v53Var = this.j;
        t90 t90Var = t90.e;
        z65.g(t90Var, "DEFAULT");
        v53Var.i(t90Var, true);
    }

    @Override // defpackage.dua
    public void b() {
        t();
        c();
    }

    @Override // defpackage.dua
    public StateEntity c() {
        return d(y().actualize(new StateRequest(this.b.b())));
    }

    @Override // defpackage.dua
    public StateEntity d(StateDto stateDto) {
        z65.h(stateDto, "stateDto");
        this.I.debug("::analyzeState");
        String b2 = this.b.b();
        StateEntity a2 = this.r.a(stateDto, this.w.a(bq3.j6));
        if (d8c.a(a2, b2)) {
            s(a2);
            if (z65.c(a2.getLocalityId(), A())) {
                C(a2);
            }
        }
        return a2;
    }
}
