# Design Patterns Repository

本倉庫收錄並整理了多種設計模式的概念、優缺點及應用場景，旨在幫助開發者更有效地理解與應用這些模式。

## 設計模式概述

### Strategy Pattern（策略模式）
策略模式透過**定義一組可互換的行為**，使得物件能夠在執行期間（runtime）決定應使用哪種策略，而不需要修改原始類別的程式碼。此模式主要利用**多型（polymorphism）與組合（composition）**來取代傳統的繼承（inheritance），從而提升設計的靈活性。

在現代開發中，策略模式依然廣泛應用，特別是在**僅支援單一繼承**的 Java 環境中尤為重要。常見應用場景包括：
- 演算法的選擇（如排序、加密）
- 動態切換不同的行為（如支付方式、日誌策略）
- 簡化條件判斷（避免過多的 if-else 或 switch-case）

### Observer Pattern（觀察者模式）
觀察者模式定義了一對多的關係，讓多個**觀察者（Observers）**能夠監聽**主體（Subject）**的狀態變化，並在變更時自動收到通知。

實現方式通常包含：
1. `Subject` 維護一組 `Observer` 物件。
2. `Observer` 註冊（attach）至 `Subject`。
3. `Subject` 狀態改變時，通知所有 `Observer`。

然而，由於 `Subject` 直接管理 `Observer`，導致兩者之間存在**高度耦合**，這在大規模分散式系統中可能會帶來維護與擴展上的挑戰。因此，現代開發逐漸轉向**事件驅動架構（Event-Driven Architecture, EDA）**與**訊息佇列（Message Queue, MQ）**來實現類似的功能，如：
- 事件總線（Event Bus）
- Kafka、RabbitMQ 等訊息中介軟體
- WebSocket 實現即時通知

### Decorator Pattern（裝飾者模式）
裝飾者模式允許在不修改原有類別的前提下，**動態地擴充物件的行為**。它透過**將原物件包裝（wrapping）於另一個實作相同介面的類別中**，實現開閉原則（Open-Closed Principle，OCP）。

核心概念：
1. **使用組合（composition）而非繼承（inheritance）**，透過將原物件傳入裝飾者類別的建構子，使裝飾者能夠擴展原物件的功能。
2. **支援動態組裝（runtime composition）**，允許物件在執行期間被包裝多層裝飾者，以實現高度靈活的功能擴展。
3. **常與 Factory Pattern 及 Builder Pattern 搭配使用**，用來簡化物件的建立與組裝。

應用場景：
- Java I/O Streams（如 `BufferedReader`、`InputStreamReader`）
- GUI 元件動態添加行為（如 Swing 中的 `JComponent`）
- 授權與驗證（如 Spring Security 的 `AuthenticationProvider`）

---

本倉庫會持續更新更多設計模式的詳細解釋與實作範例，歡迎貢獻與交流！
