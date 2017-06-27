package com.example.java.designpattern.builder;

public class Component {
    private String partA;
    private String partB;
    private String partC;

    public Component(Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String partA;
        private String partB;
        private String partC;

        public Builder() {}

        public Builder addPartA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder addPartB(String partB) {
            this.partB = partB;
            return this;
        }

        public Builder addPartC(String partC) {
            this.partC = partC;
            return this;
        }

        public Component build() {
            return new Component(this);
        }
    }

    @Override
    public String toString() {
        return "Component{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
