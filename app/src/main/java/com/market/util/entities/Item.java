package com.market.util.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    private final int id;
    private final String name;
    private final String size;
    private final String ingredients;
    private final String instructions;
    private final int image;

    public Item(int id, String name, String size, String ingredients, String instructions, int image) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.image = image;
    }

    protected Item(Parcel in) {
        id = in.readInt();
        name = in.readString();
        size = in.readString();
        ingredients = in.readString();
        instructions = in.readString();
        image = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(size);
        parcel.writeString(ingredients);
        parcel.writeString(instructions);
        parcel.writeInt(image);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getImage() {
        return image;
    }
}