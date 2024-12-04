<?php

namespace php\demonck\fxtaskbar;

use php\gui\UXScene;

/**
 * FXTaskBarNativeWindows класс для управления прогрессом на панели задач.
 */
class FXTaskBarNativeWindows
{
    /**
     * Конструктор класса.
     *
     * @param Scene $scene Объект сцены, используемый для получения окна.
     */
    public function __construct(UXScene $scene)
    {
    }

    /**
     * Проверяет поддержку.
     *
     * @return bool Возвращает true, если поддержка есть.
     */
    public static function isSupport()
    {
    }

    /**
     * Проверяет отсутствие поддержку.
     *
     * @return bool Возвращает true, если поддержка отсутствует.
     */
    public static function isNotSupport()
    {
    }

    /**
     * Показывает неопределенный прогресс на панели задач.
     *
     * @return void
     */
    public function showIndeterminateProgress()
    {
    }

    /**
     * Показывает пользовательский прогресс на панели задач.
     *
     * @param int $l1 Текущее значение прогресса.
     * @param int $l2 Общее значение прогресса.
     * @param string $type Тип прогресса (NORMAL, ERROR и т. д.).
     * @return void
     */
    public function showCustomProgress(int $l1, int $l2, string $type)
    {
    }

    /**
     * Останавливает отображение прогресса на панели задач.
     *
     * @return void
     */
    public function stopProgress()
    {
    }

    /**
     * Показывает прогресс с полной ошибкой на панели задач.
     *
     * @return void
     */
    public function showFullErrorProgress()
    {
    }

    /**
     * Показывает прогресс в состоянии паузы на панели задач.
     *
     * @return void
     */
    public function showFullPausedProgress()
    {
    }

    /**
     * Показывает нормальный полный прогресс на панели задач.
     *
     * @return void
     */
    public function showFullNormalProgress()
    {
    }
}