package builderPattern;

abstract class Builder {
    abstract void setPart();
    abstract Product buildPart();
}
