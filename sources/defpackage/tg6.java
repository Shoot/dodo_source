package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.m78;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ComboTemplateSlotDto;
import ru.dodopizza.backend.domain.menu.dto.ComboTemplateSlotProductDto;
import ru.dodopizza.backend.domain.menu.dto.FoodValueDto;
import ru.dodopizza.backend.domain.menu.dto.IngredientDto;
import ru.dodopizza.backend.domain.menu.dto.ProductDto;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
import ru.dodopizza.backend.domain.menu.dto.ToppingDto;
/* compiled from: MenuProductsConverter.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208¢\u0006\u0004\b;\u0010<J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\u001a\u0010\u001c\u001a\u00020\u0017*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J \u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\u001a\u0010\"\u001a\u00020\u001a*\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0019H\u0002J \u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020#2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020-H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109¨\u0006="}, d2 = {"Ltg6;", "Lqg6;", "Lru/dodopizza/backend/domain/menu/dto/ProductDto;", "productDto", "Lfl8;", e.a, "", "singleProducts", DateTokenConverter.CONVERTER_KEY, "Lswb;", "k", "Lfna;", "sizeGroup", "l", "Lm78$a;", "portion", "Lm78;", Image.TYPE_HIGH, "Lw63;", "doughType", "i", "Lqma;", "j", "Lzi1;", "g", "", "Lcj1;", "productSlots", "o", "Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotDto;", "dto", c.a, "Ldj1;", "slotProducts", "p", "Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotProductDto;", "b", "Lru/dodopizza/backend/domain/menu/dto/IngredientDto;", "Lul8;", "f", "Lru/dodopizza/backend/domain/menu/dto/FoodValueDto;", "Lrl8;", Image.TYPE_MEDIUM, "Lkm8;", "n", "Lru/dodopizza/backend/domain/menu/dto/ToppingDto;", "Lejb;", "q", "products", "a", "Lgna;", "Lgna;", "sizeGroupResolver", "Lx63;", "Lx63;", "doughTypeResolver", "", "Z", "isTransparentImageUrlEnabled", "<init>", "(Lgna;Lx63;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tg6  reason: default package */
/* loaded from: classes4.dex */
public final class tg6 implements qg6 {
    private final gna a;
    private final x63 b;
    private final boolean c;

    /* compiled from: MenuProductsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tg6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sm8.values().length];
            try {
                iArr[sm8.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sm8.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sm8.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sm8.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sm8.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tg6(gna gnaVar, x63 x63Var, boolean z) {
        z65.h(gnaVar, "sizeGroupResolver");
        z65.h(x63Var, "doughTypeResolver");
        this.a = gnaVar;
        this.b = x63Var;
        this.c = z;
    }

    private final dj1 b(ComboTemplateSlotProductDto comboTemplateSlotProductDto, Collection<? extends fl8> collection) {
        Object obj;
        Iterator<T> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((fl8) obj).getId(), comboTemplateSlotProductDto.getProductId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        fl8 fl8Var = (fl8) obj;
        if (fl8Var == null) {
            return null;
        }
        String id = comboTemplateSlotProductDto.getId();
        int priority = comboTemplateSlotProductDto.getPriority();
        kn6 kn6Var = kn6.c;
        return new dj1(id, priority, fl8Var, kn6Var.b(comboTemplateSlotProductDto.getPrice()), kn6Var.b(((Number) mh5.c(comboTemplateSlotProductDto.getExtraPrice(), Double.valueOf(0.0d))).doubleValue()));
    }

    private final cj1 c(ComboTemplateSlotDto comboTemplateSlotDto, Collection<? extends fl8> collection) {
        ArrayList arrayList = new ArrayList();
        for (ComboTemplateSlotProductDto comboTemplateSlotProductDto : comboTemplateSlotDto.getSlotProducts()) {
            dj1 b = b(comboTemplateSlotProductDto, collection);
            if (b != null) {
                arrayList.add(b);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return p(comboTemplateSlotDto, arrayList);
    }

    private final fl8 d(ProductDto productDto, Collection<? extends fl8> collection) {
        if (a.$EnumSwitchMapping$0[sm8.a.a(productDto.getType()).ordinal()] == 5) {
            return g(productDto, collection);
        }
        return null;
    }

    private final fl8 e(ProductDto productDto) {
        int i = a.$EnumSwitchMapping$0[sm8.a.a(productDto.getType()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return k(productDto);
                }
                return j(productDto);
            }
            return h(productDto, m78.a.b);
        }
        return h(productDto, m78.a.a);
    }

    private final ul8 f(IngredientDto ingredientDto) {
        return new ul8(ingredientDto.getId(), ingredientDto.getParentId(), ingredientDto.getName(), ingredientDto.isRemovable());
    }

    private final zi1 g(ProductDto productDto, Collection<? extends fl8> collection) {
        ArrayList arrayList = new ArrayList();
        for (ComboTemplateSlotDto comboTemplateSlotDto : productDto.getComboTemplateSlots()) {
            cj1 c = c(comboTemplateSlotDto, collection);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return o(productDto, arrayList);
    }

    private final m78 h(ProductDto productDto, m78.a aVar) {
        fna a2 = this.a.a(productDto.getSizeSchemeId(), productDto.getSizeGroup());
        w63 a3 = this.b.a(productDto.getDoughSchemeId(), productDto.getDough());
        if (a2 != null && a3 != null) {
            return i(productDto, a2, a3, aVar);
        }
        return null;
    }

    private final m78 i(ProductDto productDto, fna fnaVar, w63 w63Var, m78.a aVar) {
        int w;
        int w2;
        int w3;
        String id = productDto.getId();
        String name = productDto.getName();
        String description = productDto.getDescription();
        String allergens = productDto.getAllergens();
        String allergensCanContain = productDto.getAllergensCanContain();
        rl8 m = m(productDto.getFoodValue());
        List<IngredientDto> ingredients = productDto.getIngredients();
        w = lc1.w(ingredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (IngredientDto ingredientDto : ingredients) {
            arrayList.add(f(ingredientDto));
        }
        List<ProductImageDto> images = productDto.getImages();
        w2 = lc1.w(images, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ProductImageDto productImageDto : images) {
            arrayList2.add(ug6.b(productImageDto, this.c));
        }
        km8 n = n(productDto);
        String pizzaId = productDto.getPizzaId();
        List<ToppingDto> toppings = productDto.getToppings();
        w3 = lc1.w(toppings, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (ToppingDto toppingDto : toppings) {
            arrayList3.add(q(toppingDto));
        }
        return new m78(id, name, description, allergens, allergensCanContain, m, arrayList, arrayList2, n, pizzaId, arrayList3, fnaVar, w63Var, aVar);
    }

    private final qma j(ProductDto productDto) {
        int w;
        int w2;
        int w3;
        String id = productDto.getId();
        String name = productDto.getName();
        String category = productDto.getCategory();
        String description = productDto.getDescription();
        String allergens = productDto.getAllergens();
        String allergensCanContain = productDto.getAllergensCanContain();
        rl8 m = m(productDto.getFoodValue());
        List<IngredientDto> ingredients = productDto.getIngredients();
        w = lc1.w(ingredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (IngredientDto ingredientDto : ingredients) {
            arrayList.add(f(ingredientDto));
        }
        List<ProductImageDto> images = productDto.getImages();
        w2 = lc1.w(images, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ProductImageDto productImageDto : images) {
            arrayList2.add(ug6.b(productImageDto, this.c));
        }
        km8 n = n(productDto);
        String id2 = productDto.getId();
        List<ToppingDto> toppings = productDto.getToppings();
        w3 = lc1.w(toppings, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (ToppingDto toppingDto : toppings) {
            arrayList3.add(q(toppingDto));
        }
        return new qma(id, name, category, description, allergens, allergensCanContain, m, arrayList, arrayList2, n, id2, arrayList3);
    }

    private final swb k(ProductDto productDto) {
        fna a2 = this.a.a(productDto.getSizeSchemeId(), productDto.getSizeGroup());
        if (a2 != null) {
            return l(productDto, a2);
        }
        return null;
    }

    private final swb l(ProductDto productDto, fna fnaVar) {
        int w;
        int w2;
        int w3;
        String id = productDto.getId();
        String name = productDto.getName();
        String description = productDto.getDescription();
        String allergens = productDto.getAllergens();
        String allergensCanContain = productDto.getAllergensCanContain();
        rl8 m = m(productDto.getFoodValue());
        List<IngredientDto> ingredients = productDto.getIngredients();
        w = lc1.w(ingredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (IngredientDto ingredientDto : ingredients) {
            arrayList.add(f(ingredientDto));
        }
        List<ProductImageDto> images = productDto.getImages();
        w2 = lc1.w(images, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ProductImageDto productImageDto : images) {
            arrayList2.add(ug6.b(productImageDto, this.c));
        }
        km8 n = n(productDto);
        String category = productDto.getCategory();
        String id2 = productDto.getId();
        List<ToppingDto> toppings = productDto.getToppings();
        w3 = lc1.w(toppings, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (ToppingDto toppingDto : toppings) {
            arrayList3.add(q(toppingDto));
        }
        return new swb(id, name, description, allergens, allergensCanContain, m, arrayList, arrayList2, n, id2, category, arrayList3, fnaVar);
    }

    private final rl8 m(FoodValueDto foodValueDto) {
        return new rl8(String.valueOf(foodValueDto.getFats()), String.valueOf(foodValueDto.getProteins()), String.valueOf(foodValueDto.getCarbohydrates()), String.valueOf(foodValueDto.getKiloCalories()), String.valueOf(foodValueDto.getWeight()));
    }

    private final km8 n(ProductDto productDto) {
        return new km8(productDto.getSize().getMeasure(), km8.c.a(productDto.getSize().getValue()));
    }

    private final zi1 o(ProductDto productDto, List<cj1> list) {
        int w;
        String id = productDto.getId();
        String name = productDto.getName();
        String category = productDto.getCategory();
        String description = productDto.getDescription();
        List<ProductImageDto> images = productDto.getImages();
        w = lc1.w(images, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ProductImageDto productImageDto : images) {
            arrayList.add(ug6.b(productImageDto, this.c));
        }
        return new zi1(id, name, category, description, arrayList, list);
    }

    private final cj1 p(ComboTemplateSlotDto comboTemplateSlotDto, List<dj1> list) {
        return new cj1(comboTemplateSlotDto.getId(), comboTemplateSlotDto.getName(), comboTemplateSlotDto.getPriority(), comboTemplateSlotDto.getDefaultProductId(), list);
    }

    private final ejb q(ToppingDto toppingDto) {
        String uuid = toppingDto.getUuid();
        String parentUUId = toppingDto.getParentUUId();
        String name = toppingDto.getName();
        String imageUrl = toppingDto.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        return new ejb(uuid, parentUUId, name, imageUrl, kn6.c.b(toppingDto.getPrice()), false, toppingDto.getCanAddToVariation());
    }

    @Override // defpackage.qg6
    public Collection<fl8> a(List<ProductDto> list) {
        List q0;
        z65.h(list, "products");
        List<ProductDto> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (ProductDto productDto : list2) {
            fl8 e = e(productDto);
            if (e != null) {
                arrayList.add(e);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ProductDto productDto2 : list2) {
            fl8 d = d(productDto2, arrayList);
            if (d != null) {
                arrayList2.add(d);
            }
        }
        q0 = sc1.q0(arrayList, arrayList2);
        return q0;
    }
}
