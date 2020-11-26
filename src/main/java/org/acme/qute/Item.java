package org.acme.qute;

import java.math.BigDecimal;
import java.util.Set;

public class Item {

    public final BigDecimal price;
    public final String name;
    private final Set<String> tags;

    public Item(BigDecimal price, String name, Set<String> tags) {
        this.price = price;
        this.name = name;
        this.tags = tags;
    }

    public Set<String> tags() {
        return tags;
    }

}
