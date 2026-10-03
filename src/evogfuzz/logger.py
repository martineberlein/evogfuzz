from __future__ import annotations

import logging

__all__ = ["LOGGER", "VLOGGER"]

logging.basicConfig(
    level=logging.INFO,
    format="%(name)s :: %(levelname)-8s :: %(message)s",
)

LOGGER: logging.Logger = logging.getLogger("evogfuzz")
VLOGGER: logging.Logger = logging.getLogger("evaluation")
