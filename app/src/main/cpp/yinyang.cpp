//
// Created by lusin on 2022/12/13.
//
#include "yinyang.h"

YinYang::YinYang(void)
{
}

YinYang::~YinYang(void)
{
}

bool YinYang::isYang()
{
    return this->yang;
}

bool YinYang::isYin()
{
    return !(this->yang);
}

bool YinYang::isHe(int gan, int zhi)
{
    return ( (gan % 2) == (zhi % 2));
}

