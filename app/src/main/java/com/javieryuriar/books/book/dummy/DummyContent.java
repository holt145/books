package com.javieryuriar.books.book.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String book_name;
        public final String buyable_link;
        public final String book_image;

        public DummyItem(String id, String book_name, String buyable_link,
                         String book_image) {
            this.id = id;
            this.book_name = book_name;
            this.buyable_link = buyable_link;
            this.book_image = book_image;
        }

        @Override
        public String toString() {
            return book_name;
        }
    }

    static {
        addItem(new DummyItem("1", "Harry potter", "http://www.harrypotter.com", "https://ewedit.files.wordpress.com/2016/09/hpsorcstone.jpg"));
        addItem(new DummyItem("2", "Tres Mosqueteros", "http://www.google.com", "https://images-na.ssl-images-amazon.com/images/I/51NQBEJ218L._SX317_BO1,204,203,200_.jpg"));
        addItem(new DummyItem("3", "Android For Dummies", "http://www.android.com", "<https://s3-ap-southeast-2.amazonaws.com/wc-prod-pim/JPEG_1000x1000/JW18720301_android_phones_for_dummies.jpg"));
    }
}
