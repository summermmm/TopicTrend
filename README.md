# TopicTrend
面向目标的话题发现和趋势分析

## 处理流程
数据清洗 -> 数据分类，噪声过滤 -> 话题发现 -> 话题描述 -> 话题归一 -> 影响力分析 -> 趋势分析 -> 前端展示

## 处理模块介绍
* preprocess
数据清洗和预处理
* classifier
数据分类，构建分类器
* topic_detect
话题热点发现，并生成话题描述和向量
* topic_trend
话题建模，影响力和趋势分析
* web_service
功能服务API接口
* front_page
web前端展示

## 使用说明
将功能模块构建成DAG工作流，每天定时调度

## 业务流程
![](https://github.com/baifendian/TopicTrend/blob/master/yewu.png) 

## 系统架构
![](https://github.com/baifendian/TopicTrend/blob/master/jiagou.png) 
